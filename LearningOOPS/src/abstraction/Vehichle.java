package abstraction;

abstract class Vehichle {
	float mileage = 0; //data member
	
	Vehichle(){ // constructor
		System.out.println("Vehichle is created");
	}
	
	void run() { // non abstract method
		System.out.println("Running");
	}
	
	abstract void tellType(); // abstract method
}
