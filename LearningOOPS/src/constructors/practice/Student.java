package constructors.practice;

public class Student {
	int rollNo;
	String name;
	
	public Student(int rNo, String n) {
		rollNo = rNo;
		name = n;
	}
	
	public Student(Student s) {
		rollNo = s.rollNo;
		name = s.name;
	}
	
	void showStudentDetails() {
		System.out.println(rollNo + " " + name);
	}
}