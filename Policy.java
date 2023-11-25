public class Policy
{  
   private static int size = 0;
   private String number,
                  provider;

   /**
      No-arg Constructor
   */
   public Policy()
   {
      number = "";
      provider = "";
      
      size++;
   }
   
   /**
      Constructor
      @param numberStr the client's insurance number
      @param providerStr the client's provider
   */
   public Policy(String numberStr, String providerStr)
   {
      number = numberStr;
      provider = providerStr;
      
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
      String str = "Insurance Provider: " + provider + "\nInsurance Number: " + number;
      
      return str;
   }
   
   /**
      accessor method to return the amount of object made;
      @return size the amount of object made
   */
   public int getSize()
   {
      return size;
   }
}