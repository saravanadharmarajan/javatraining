package training.basics;

public class UseBottle {

	public static void main(String[] args) {
		
		int divsion=1;
		
		try {
			Bottle bottleObj = new Bottle();
			
			String bottleState=null;
			bottleState=bottleObj.getBottleState();
			final String closed="CLOSED";
			int result=divsion/0;
			
			if(bottleState==null)
			{
				System.out.println("Bottle State is not received..");
			}
			else if(closed.equals(bottleState))
			{
				bottleObj.close();
			}
			else
			{
				bottleObj.open();
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally
		{
			try {
				System.out.println("Executed this before exiting");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
