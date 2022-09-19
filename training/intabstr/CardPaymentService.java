package training.intabstr;

public class CardPaymentService extends PaymentService {

	boolean isCustomerFraud=false;
	
	public boolean isCustomerFraud() {
		return isCustomerFraud;
	}

	public void payforride(int customerId,long creditCardNo ,double amount)
	{
		 isCustomerFraud=this.isFraudCustomer(customerId);
		if(!isCustomerFraud)
		{
			invokePaymentGateway(creditCardNo,amount);
		}
	}

	private void invokePaymentGateway(long creditCardNo,double amount) {
		System.out.println("Invoking Payment Gateway....");
		
	}

	@Override
	public boolean isAdditionalChecksRequired(int customerId) {
		if(isCustomerFraud())
		{
			return true;
		}
		else {
			return false;
		}
		
	}
	
}
