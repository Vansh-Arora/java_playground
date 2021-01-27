package polymorphism;

public class Mango {
	Mango(){
		this(7);
		System.out.println("I am mango.");
	}
	
	Mango(int num){
		System.out.println("Can you eat " + num + " units.");
	}

}
