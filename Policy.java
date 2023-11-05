class Policy
{
   private double height,
                  weight;
   private int age;
   private String number, 
                  provider,
                  firstName,
                  lastName,
                  smokeStatus;

   /**
      No-arg Constructor
   */
   public Policy()
   {
      height = 0.0;
      weight = 0.0;
      age = 0;
      number = "";
      provider = "";
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
   public Policy(double heightNum, double weightNum, int ageInt, String numberStr, String providerStr, String firstNameStr, String lastNameStr, String smokeStatusStr)
   {
      height = heightNum;
      weight = weightNum;
      age = ageInt;
      number = numberStr;
      provider = providerStr;
      firstName = firstNameStr;
      lastName = lastNameStr;
      smokeStatus = smokeStatusStr;
   }
   
   /**
      Accessor for client's height
      @return the client's height
   */
   public double getHeight()
   {
      return height;
   }
   
   /**
      Accessor for client's weight
      @return the client's weight
   */
   public double getWeight()
   {
      return weight;
   }
   
   /**
      Accessor for client's age
      @return the client's age
   */
   public int getAge()
   {
      return age;
   }
   
   /**
      Accessor for client's insurance number
      @return the client's insurance number
   */
   public String getNumber()
   {
      return number;
   }
   
   /**
      Accessor for client's insurance provider
      @return the client's insurance provider
   */
   public String getProvider()
   {
      return provider;
   }
   
   /**
      Accessor for client's first name
      @return the client's first name
   */
   public String getFirstName()
   {
      return firstName;
   }
   
   /**
      Accessor for client's last name
      @return the client's last name
   */
   public String getLastName()
   {
      return lastName;
   }
   
   /**
      Accessor for client's smoking status
      @return the client's smoking status
   */
   public String getSmokeStatus()
   {
      return smokeStatus;
   }
   
   /**
      Mutator for client's height
      @param heightNum the client's height
   */
   public void setHeight(double heightNum)
   {
       height = heightNum;
   }
   
   /**
      Mutator for client's weight
      @param weightNum the client's weight
   */
   public void setWeight(double weightNum)
   {
      weight = weightNum;
   }
   
   /**
      Mutator for client's age
      @param ageInt the client's age
   */
   public void setAge(int ageInt)
   {
      age = ageInt;
   }
   
   /**
      Mutator for client's insurance number
      @param numberStr the client's insurance number
   */
   public void setNumber(String numberStr)
   {
      number = numberStr;
   }
   
   /**
      Mutator for client's insurance provider
      @param providerStr the client's insurance provider
   */
   public void setProvider(String providerStr)
   {
      provider = providerStr;
   }
   
   /**
      Mutator for client's first name
      @param firstNameStr the client's first name
   */
   public void setFirstName(String firstNameStr)
   {
      firstName = firstNameStr;
   }
   
   /**
      Mutator for client's last name
      @param lastNameStr the client's last name
   */
   public void setLastName(String lastNameStr)
   {
      lastName = lastNameStr;
   }
   
   /**
      Mutator for client's smoking status
      @param smokeStatusStr the client's smoking status
   */
   public void setSmokeStatus(String smokeStatusStr)
   {
      smokeStatus = smokeStatusStr;
   }
   
   /**
      Calculate the client's Body Mass Index
      @return BMI the client's BMI
   */
   public double getBMI()
   {  
      final double CONSTANT = 703;
      
      return (weight * CONSTANT) / (height * height);
   }
   
   /**
      Calculate the fees
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
}