public class Policy
{  
   private static int size = 0;
   private String number,
                  provider;
   private PolicyHolder holder;

   /**
      No-arg Constructor
   */
   public Policy()
   {
      number = "";
      provider = "";
      holder = new PolicyHolder();
      
      size++;
   }
   
   /**
      Constructor
      @param numberStr the client's insurance number
      @param providerStr the client's provider
   */
   public Policy(String numberStr, String providerStr, double height, double weight, int age, String firstName, String lastName, String smokeStatus)
   {
      number = numberStr;
      provider = providerStr;
      holder = new PolicyHolder(height, weight, age, firstName, lastName, smokeStatus);
      
      size++;
   }
   
   /**
      Accessor for returning the client's insurance number
      @return the client's insurance number
   */
   public String getNumber()
   {
      return number;
   }
   
   /**
      Accessor for returning the client's insurance provider
      @return the client's insurance provider
   */
   public String getProvider()
   {
      return provider;
   }
   
   /**
      Mutator for setting the client's insurance number
      @param numberStr the client's insurance number
   */
   public void setNumber(String numberStr)
   {
      number = numberStr;
   }
   
   /**
      Mutator for setting the client's insurance provider
      @param providerStr the client's insurance provider
   */
   public void setProvider(String providerStr)
   {
      provider = providerStr;
   }
   
   /**
      toString method for returning the status of the object
      @return str The status of the object in String form
   */
   public String toString()
   {
      String str = "Policy Number: " + number + "\nProvider Name: " + provider + "\n" + holder;
      
      return str;
   }
   
   /**
      Calculate and return the client's Body Mass Index
      @return holder.getBMI() the client's BMI
   */
   public double getBMI()
   {        
      return holder.getBMI();
   }
   
   /**
      return the fees
      @return holder.getFee() the client's insurance fees
   */
   public double getFee()
   {  
      return holder.getFee();
   }
   
   /**
      return the fees
      @return holder.getFee() the client's insurance fees
   */
   public String getSmokeStatus()
   {  
      return holder.getSmokeStatus();
   }
   
   /**
      accessor method to return the amount of object made;
      @return size the amount of object made
   */
   public static int getSize()
   {
      return size;
   }
}