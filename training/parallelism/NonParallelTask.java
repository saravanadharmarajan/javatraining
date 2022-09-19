package training.parallelism;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NonParallelTask  {

	
	
	public NonParallelTask() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NonParallelTask(ArrayList<Integer> printList, String taskType) {
		super();
		this.printList = printList;
		this.taskType = taskType;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	
	private ArrayList<Integer> printList=null;

	public ArrayList<Integer> getPrintList() {
		return printList;
	}

	public void setPrintList(ArrayList<Integer> printList) {
		this.printList = printList;
	}

	String taskType=null;
	

	public void run() {
		String tasktype=getTaskType();
		
		ArrayList<Integer> printList=this.getPrintList();
		try {
			if(tasktype!=null && "ODD".equals(tasktype))
			{
				for (Iterator iterator = printList.iterator(); iterator.hasNext();) {
					Integer integer = (Integer) iterator.next();
					if(integer%2!=0)
					{
						Thread.sleep(3600);
						System.out.println("Printing "+tasktype+" Entries..."+Thread.currentThread().getId());
					}
					
				}
			}
				else
				{
					for (Iterator iterator = printList.iterator(); iterator.hasNext();) {
						Integer integer = (Integer) iterator.next();
						if(integer%2==0)
						{
							Thread.sleep(1500);
							System.out.println("Printing "+tasktype+" Entries.."+Thread.currentThread().getId());
						}
						
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
