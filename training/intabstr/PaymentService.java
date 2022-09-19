package training.intabstr;

public abstract class PaymentService {
	
	public boolean isFraudCustomer(int customerId)
	{
		boolean isFraud=false;
		
		try
		{
			int randomNo = (int) (Math.random()% 2);
			if(randomNo==0)
			{
				isFraud=false;
			}
			else
			{
				isFraud=true;
			}
		}
		catch(Exception exp)
		{
			
		}
		return isFraud;
	}
	
	public abstract boolean isAdditionalChecksRequired(int customerId);

}
