package Inheritance;

public class Tester extends Employee{
	float bonus = 5000;
	
	public static void main(String args[]) {
		Tester nick = new Tester();
		System.out.println("Salary: " + nick.salary);
		System.out.println("Bonus: " + nick.bonus);
	}
}
