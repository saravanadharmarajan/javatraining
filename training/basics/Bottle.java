package training.basics;

public class Bottle {
	private int capacity;
	private String material;
	private boolean isClosed;
	
	Bottle()
	{
		System.out.println("I am being instantiated..");
	}
	
	Bottle(boolean state)
	{
		isClosed=state;
	}
	
	public void open()
	{
		
		if(isClosed)
		{
			isClosed=false;
		}
		{
			System.out.println(" Bottle is already open");
		}
	}
	public void close()
	{
		 String newatrr;
		 
		if(isClosed)
		{
			System.out.println(" Bottle is already Closed");
		}
		{
			isClosed=true;
		}
	}
	public String getBottleState()
	{
		String bottleState=null;
		
		if(isClosed)
		{
			bottleState="CLOSED";
		}
		else
		{
			bottleState="OPEN";
		}
		return bottleState;
	}

}
