package training.basics;

public class DailyEmployee extends Employee {
	public DailyEmployee(int EmpId) {
		super(EmpId);
		// TODO Auto-generated constructor stub
	}
	private double workHours;
	
	public double getWorkHours() {
		System.out.println("Employee Id is "+getEmpId());
		
		return workHours;
	}
	
	public void setWorkHours(double workHours) {
		this.workHours = workHours;
	}
	public int getDailyWage() {
		return dailyWage;
	}
	public void setDailyWage(int dailyWage) {
		this.dailyWage = dailyWage;
	}
	private int dailyWage;
	

}
