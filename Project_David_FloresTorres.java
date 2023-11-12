import java.util.*;
import java.io.*;

class Project_David_FloresTorres
{
   public static void main(String[] args) throws IOException
   {
      double height = 0.0,
             weight = 0.0;
      int age = 0,
          totalSmokers = 0,
          totalNonsmokers = 0;
      String number = "", 
             provider = "",
             firstName = "",
             lastName = "",
             smokeStatus = "";
             
      //Create a Policy object to store client information
      Policy client;
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
         {
            input.nextLine();
            input.nextLine();
         }
         
         //Store input information into Policy object
         client = new Policy(height, weight, age, number, provider, firstName, lastName, smokeStatus);
         //Add Policy instances to ArrayList
         list.add(client);
      }

         System.out.print("\nPolicy Number: " + client.getNumber());
         System.out.print("\nProvider Name: " + client.getProvider());
         System.out.print("\nPolicyholder's First Name: " + client.getFirstName());
         System.out.print("\nPolicyholder's Last Name: " + client.getLastName());
         System.out.print("\nPolicyholder's Age: " + client.getAge());
         System.out.print("\nPolicyholder's Smoking Status: " + client.getSmokeStatus());
         System.out.printf("\nPolicyholder's Height: %,.1f inches", client.getHeight());
         System.out.printf("\nPolicyholder's Weight: %,.1f pounds", client.getWeight());
         System.out.printf("\nPolicyholder's BMI: %,.2f", client.getBMI());
         System.out.printf("\nPolicy Price: $%,.2f\n\n", client.getFee());

   }
}