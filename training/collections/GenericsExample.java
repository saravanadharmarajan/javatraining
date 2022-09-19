package training.collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import training.basics.Bottle;
import training.basics.Employee;
import training.basics.UseBottle;

public class GenericsExample {

	public static void main(String[] args) {
	try {
		
		List simpleList = new ArrayList<Employee>();
		Employee emp= new Employee(1234);
		Employee empFromList=null;
		
		simpleList.add(emp);
		 emp= new Employee(2345);
		 emp.setEmpId(1234);
		 emp.setDesignation("Developer");
		simpleList.add(emp);
		for (Object object : simpleList) {
			empFromList=(Employee)object;
			System.out.println(empFromList);
		
		}
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}

	}

}
