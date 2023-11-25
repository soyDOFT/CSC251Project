public class PolicyHolder
{
   private double height,
                  weight;
   private int age;
   private String firstName,
                  lastName,
                  smokeStatus;
   
   /**
      No-arg Constructor
   */
   public PolicyHolder()
   {
      height = 0.0;
      weight = 0.0;
      age = 0;
      firstName = "";
      lastName = "";
      smokeStatus = "";
   }
   
   /**
      Constructor
      @param heightNum the client's height
      @param weightNum the client's weight
      @param ageInt the client's age
      @param numberStr the client's insurance number
      @param providerStr the client's provider
      @param firstNameStr the client's first name
      @param lastNameStr the client's last name
      @param smokeStatusStr the client's smoke status
   */
   public PolicyHolder(double heightNum, double weightNum, int ageInt, String firstNameStr, String lastNameStr, String smokeStatusStr)
   {
      height = heightNum;
      weight = weightNum;
      age = ageInt;
      firstName = firstNameStr;
      lastName = lastNameStr;
      smokeStatus = smokeStatusStr;
   }
   
   /**
      Accessor for returning the client's height
      @return the client's height
   */
   public double getHeight()
   {
      return height;
   }
   
   /**
      Accessor for returning the client's weight
      @return the client's weight
   */
   public double getWeight()
   {
      return weight;
   }
   
   /**
      Accessor for returning the client's age
      @return the client's age
   */
   public int getAge()
   {
      return age;
   }
   
   /**
      Accessor for returning the client's first name
      @return the client's first name
   */
   public String getFirstName()
   {
      return firstName;
   }
   
   /**
      Accessor for returning the client's last name
      @return the client's last name
   */
   public String getLastName()
   {
      return lastName;
   }
   
   /**
      Accessor for returning the client's smoking status
      @return the client's smoking status
   */
   public String getSmokeStatus()
   {
      return smokeStatus;
   }
   
   /**
      Mutator for setting the client's height
      @param heightNum the client's height
   */
   public void setHeight(double heightNum)
   {
       height = heightNum;
   }
   
   /**
      Mutator for setting the client's weight
      @param weightNum the client's weight
   */
   public void setWeight(double weightNum)
   {
      weight = weightNum;
   }
   
   /**
      Mutator for setting the client's age
      @param ageInt the client's age
   */
   public void setAge(int ageInt)
   {
      age = ageInt;
   }
      
   /**
      Mutator for setting the client's first name
      @param firstNameStr the client's first name
   */
   public void setFirstName(String firstNameStr)
   {
      firstName = firstNameStr;
   }
   
   /**
      Mutator for setting the client's last name
      @param lastNameStr the client's last name
   */
   public void setLastName(String lastNameStr)
   {
      lastName = lastNameStr;
   }
   
   /**
      Mutator for setting the client's smoking status
      @param smokeStatusStr the client's smoking status
   */
   public void setSmokeStatus(String smokeStatusStr)
   {
      smokeStatus = smokeStatusStr;
   }
   
   /**
      Calculate and return the client's Body Mass Index
      @return BMI the client's BMI
   */
   public double getBMI()
   {  
      final double CONSTANT = 703;
      
      return (weight * CONSTANT) / (height * height);
   }
   
   /**
      Calculate and return the fees
      @return fee the client's insurance fees
   */
   public double getFee()
   {  
      final double BASE_PRICE = 600.0;
      final double ADDITIONAL_AGE_FEE = 75.0;
      final double ADDITIONAL_SMOKE_FEE = 100.0;
      final double ADDITIONAL_FEE_PER_BMI = 20.0;
      
      final int AGE_LIMIT = 50;
      final int BMI_LIMIT = 35;
         
      //fee variable to store fees with base starting fee of $600 
      double fee = BASE_PRICE;
      
      //determine additional $75 fee based on if client's age is over 50
      if (age > AGE_LIMIT)
         fee += ADDITIONAL_AGE_FEE;

      //determine addition $100 fee based on client's smoking status
      if (smokeStatus.equals("smoker"))
         fee += ADDITIONAL_SMOKE_FEE;

      //determine addition fee based on client's BMI
      if (getBMI() > BMI_LIMIT)
         fee += ((getBMI() - BMI_LIMIT) * ADDITIONAL_FEE_PER_BMI);
         
      return fee;
   }
   
   /**
      toString method to represent object in String form
      @return str Stores and returns the object's status in String form
   */
      public String toString()
   {
      String str = "Height: " + height + "\nWeight: " + weight + "\nAge: " + age + "\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nSmoke Status: " + smokeStatus;
      
      return str;
   }
}