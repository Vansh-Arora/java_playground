package Inheritance;
// Hierarchical Inheritance Employee -> Tester && Employee -> Developer
public class Developer extends Employee {
	int bonus = 50000;
	public static void main(String args[]) {
		Developer dev = new Developer();
		System.out.println("Salary: " + dev.salary);
		System.out.println("Bonus: " + dev.bonus);
	}
}
