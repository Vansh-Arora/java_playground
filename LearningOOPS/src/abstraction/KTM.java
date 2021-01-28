package abstraction;
// Multiple Inheritance
public class KTM implements Engine,Brake{
	public void start() {
		System.out.println(power + "cc Engine started");
	}
	
	public void applyBrake() {
		System.out.println("Brakes applied");
	}
	
	public static void main(String args[]) {
		KTM duke = new KTM();
		duke.start();
		duke.applyBrake();
	}
}
