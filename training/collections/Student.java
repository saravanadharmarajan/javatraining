package training.collections;

public class Student {
	Student(int StdId)
	{
		this.studentId=StdId;
	}
	int studentId;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	String studentName;

}
