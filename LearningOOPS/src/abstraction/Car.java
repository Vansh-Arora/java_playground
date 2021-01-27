package abstraction;

public class Car extends Vehichle{
	
	Car(){
		System.out.println("Car is created");
	}
	
	float mileage = 20;
	
	void tellType() {
		System.out.println("I am a Car");
	}
	
	public static void main(String[] args) {
		Car porche = new Car();
		porche.run();
		porche.tellType();
		System.out.println(porche.mileage);
		
	}
}
