import java.util.Scanner;

class Project_David_FloresTorres
{
   public static void main(String[] args)
   {
      double height,
             weight;
      int age;
      String number, 
             provider,
             firstName,
             lastName,
             smokeStatus;
      //Create object for user input
      Scanner kb = new Scanner(System.in);
      //Prompt user for insurance information and store it
      System.out.print("Please enter the Policy Number: ");
      number = kb.nextLine();
      System.out.print("Please enter the Provider Name: ");
      provider = kb.nextLine();
      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = kb.nextLine();
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastName = kb.nextLine();
      System.out.print("Please enter the Policyholder's Age: ");
      age = kb.nextInt();
      //clear buffer
      kb.nextLine();
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokeStatus = kb.nextLine().toLowerCase();
      
      //Validate user's smoking status
      while (!smokeStatus.equals("smoker") && !smokeStatus.equals("non-smoker"))
      {
         System.out.print("Please only enter smoker/non-smoker: ");
         smokeStatus = kb.nextLine().toLowerCase();
      }
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = kb.nextDouble();
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weight = kb.nextDouble();
      
      //Call object and initalize with Policyholder's information
      Policy client = new Policy(height, weight, age, number, provider, firstName, lastName, smokeStatus);
      
      //Output all the information
      System.out.print("\nPolicy Number: " + client.getNumber());
      System.out.print("\nProvider Name: " + client.getProvider());
      System.out.print("\nPolicyholder's First Name: " + client.getFirstName());
      System.out.print("\nPolicyholder's Last Name: " + client.getLastName());
      System.out.print("\nPolicyholder's Age: " + client.getAge());
      System.out.print("\nPolicyholder's Smoking Status: " + client.getSmokeStatus());
      System.out.printf("\nPolicyholder's Height: %,.1f inches", client.getHeight());
      System.out.printf("\nPolicyholder's Weight: %,.1f pounds", client.getWeight());
      System.out.printf("\nPolicyholder's BMI: %,.2f", client.getBMI());
      System.out.printf("\nPolicy Price: $%,.2f", client.getFee());
   }
}