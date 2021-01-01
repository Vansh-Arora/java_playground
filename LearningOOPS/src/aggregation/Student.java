package aggregation;
// Aggregation : has a
public class Student {
	int rollNo;
	String name;
	Address add;
	
	public Student(int rollNo, String name, Address add) {
		this.rollNo = rollNo;
		this.name = name;
		this.add = add;
	}
	void display() {
		System.out.println(rollNo + " " + name + " " + add.country  + " " + add.state + " " + add.city);
	}
	
	public static void main(String args[]) {
		Address add1 = new Address("India","UP","Sre");
		Address add2 = new Address("India","Delhi","Delhi");
		Student stu1 = new Student(20,"Steve",add1);
		Student stu2 = new Student(21,"Steven",add2);
		stu1.display();
		stu2.display();
	}
}
