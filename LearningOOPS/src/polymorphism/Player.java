package polymorphism;

public class Player {
	double height;
	int weight;
	String sport;
	
	void setData(double height, int weight) {
		this.height = height;
		this.weight = weight;
	}
	
	void setData(double height, int weight, String sport) {
		setData(height,weight);
		this.sport = sport;
	}
	
	void getData() {
		System.out.println(height + " " + weight + " " + sport);
	}
	
	public static void main(String args[]) {
		Player kohli = new Player(), ronaldo = new Player();
		kohli.setData(5.10,65,"Cricket");
		ronaldo.setData(6, 65);
		kohli.getData();
		ronaldo.getData();
	}
}
