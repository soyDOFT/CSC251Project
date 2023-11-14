import java.util.*;
import java.io.*;

public class Project_David_FloresTorres
{
   public static void main(String[] args) throws IOException
   {
      double height = 0.0,
             weight = 0.0;
      int age = 0,
          totalSmokers = 0;
      String number = "", 
             provider = "",
             firstName = "",
             lastName = "",
             smokeStatus = "";
             
      //Create an ArrayList to store clients
      ArrayList<Policy> list = new ArrayList<>();
      //Open the PolicyInformation.txt file
      File file = new File("PolicyInformation.txt");
      //Create a Scanner object to read the file
      Scanner input = new Scanner(file);
      
      //Loop through the file and extract information to ArrayList
      while (input.hasNext())
      {
         number = input.nextLine();
         provider = input.nextLine();;
         firstName = input.nextLine();
         lastName = input.nextLine();
         age = input.nextInt();
         
         //clear buffer
         input.nextLine();
         
         smokeStatus = input.nextLine();
         height = input.nextDouble();
         weight = input.nextDouble();
         
         //skip empty lines if there is more input
         if (input.hasNext())
            input.nextLine();
         if (input.hasNext())
            input.nextLine();
         
         //Store input information into Policy object
         Policy client = new Policy(height, weight, age, number, provider, firstName, lastName, smokeStatus);
         //Add Policy instances to ArrayList
         list.add(client);
      }
      
      //Output all the information from array
      for (Policy customer : list)
      {
         System.out.print("\nPolicy Number: " + customer.getNumber());
         System.out.print("\nProvider Name: " + customer.getProvider());
         System.out.print("\nPolicyholder's First Name: " + customer.getFirstName());
         System.out.print("\nPolicyholder's Last Name: " + customer.getLastName());
         System.out.print("\nPolicyholder's Age: " + customer.getAge());
         System.out.print("\nPolicyholder's Smoking Status: " + customer.getSmokeStatus());
         System.out.printf("\nPolicyholder's Height: %,.1f inches", customer.getHeight());
         System.out.printf("\nPolicyholder's Weight: %,.1f pounds", customer.getWeight());
         System.out.printf("\nPolicyholder's BMI: %,.2f", customer.getBMI());
         System.out.printf("\nPolicy Price: $%,.2f\n\n", customer.getFee());
         
         //Increment totalSmokers every time loop encounters smoker
         if (customer.getSmokeStatus().equals("smoker"))
            totalSmokers++;
      }
      
      //close the file
      input.close();
      
      //Display smoker information
      System.out.print("\nThe number of policies with a smoker is: " + totalSmokers);
      System.out.print("\nThe number of policies with a non-smoker is: " + (list.size() - totalSmokers));

   }
}