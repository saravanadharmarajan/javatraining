package training.intabstr;

public class WalletPaymentService extends PaymentService {
	
	boolean isCustomerFraud=false;
	boolean walletBalanceCheck=true;
	
	public boolean isCustomerFraud() {
		return isCustomerFraud;
	}
	
	public void payforPrepaidWallet(int customerId,long walletId ,double amount)
	{
		walletBalanceCheck=true;
		invokePaymentGateway(walletId,amount);
	}
	
	public void payforPostPaidWallet(int customerId,long walletId ,double amount)
	{
		boolean isCustomerFraud=this.isFraudCustomer(customerId);
		if(!isCustomerFraud)
		{
			invokePaymentGateway(walletId,amount);
			walletBalanceCheck=false;
		}
	}

	private void invokePaymentGateway(long walletId,double amount) {
		System.out.println("Invoking Payment Gateway....");
		
	}

	
	@Override
	public boolean isAdditionalChecksRequired(int customerId) {
		if(isCustomerFraud() || walletBalanceCheck)
		{
			return true;
		}
		else {
			return false;
		}
		
	}
}
