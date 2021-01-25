package Inheritance;
// Multilevel inheritance Employee -> Developer -> JuniorDeveloper
public class JuniorDeveloper extends Developer{
	int bonus = 10000;
	public static void main(String args[]) {
		JuniorDeveloper jDev = new JuniorDeveloper();
		System.out.println("Salary: " + jDev.salary);
		System.out.println("Bonus: " + jDev.bonus);
	}

}
