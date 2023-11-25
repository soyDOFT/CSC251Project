public class Policy
{
   private String number,
                  provider;

   /**
      No-arg Constructor
   */
   public Policy()
   {
      number = "";
      provider = "";
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
}