package training.parallelism;

import java.util.ArrayList;

public class TaskExecutor {

	public static void main(String[] args) {
		ArrayList<Integer> printList = new ArrayList<Integer>();
		
		printList.add(5);
		printList.add(8);
		printList.add(12);
		printList.add(1);
		printList.add(2);
		printList.add(4);
		printList.add(6);
		
//		NonParallelTask printOddNp = new NonParallelTask(printList,"ODD");
//		printOddNp.run();
//		NonParallelTask printEvenNp = new NonParallelTask(printList,"EVEN");
//		printEvenNp.run();
//		
		System.out.println("\n Execution for Parallel Tasks...");
		System.out.println(".............................\n");
		Task printOdd = new Task(printList,"ODD");
		Task printEven = new Task(printList,"EVEN");
		Thread thread1 = new Thread(printOdd);
		Thread thread2 = new Thread(printEven);
		thread1.start();
		thread2.start();
		
		
		

	}

}
