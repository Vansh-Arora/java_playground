package polymorphism;

public class Adder {
	public static int add(int a, int b) {
		return (a+b);
	}
	public static double add(double a, double b) {
		return(a+b);
	}
	public static void main(String args[]) {
		int sum = Adder.add(20, 7);
		System.out.println(sum);
		double sum2 = Adder.add(2.0,2.6);
		System.out.println(sum2);
	}
}
