package abstraction;

public class KTM implements Engine{
	public void start() {
		System.out.println(power + "cc Engine started");
	}
	
	public static void main(String args[]) {
		KTM duke = new KTM();
		duke.start();
	}
}
