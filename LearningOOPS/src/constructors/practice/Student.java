package constructors.practice;

public class Student {
	int rollNo;
	String name;
	
	public Student(int rNo, String n) {
		rollNo = rNo;
		name = n;
	}
	
	void showStudentDetails() {
		System.out.println(rollNo + " " + name);
	}
}