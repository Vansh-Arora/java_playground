package polymorphism;

public class MainOverloading {
	public static void main() {
		System.out.println("Simple main");
	}
	
	public static void main(int a) {
		System.out.println(a);
	}
	
	public static void main(String args[]) {
		System.out.println("Start here");
		main();
		main(1);
	}
}
