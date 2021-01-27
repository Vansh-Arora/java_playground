package abstraction;

public class Cactus extends Plant{
	public void giveOxygen() {
		System.out.println("Giving oxygen");
	}
	
	public static void main(String args[]) {
		Cactus caci = new Cactus();
		caci.giveOxygen();
	}

}
