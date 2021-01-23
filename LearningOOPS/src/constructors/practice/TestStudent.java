package constructors.practice;

public class TestStudent {
	public static void main(String args[]) {
		Student s1 = new Student(1,"Vansh"), s2 = new Student(2,"Richie"), s3 = new Student(s2);
		s1.showStudentDetails();
		s2.showStudentDetails();
		s3.showStudentDetails();		
	}
}