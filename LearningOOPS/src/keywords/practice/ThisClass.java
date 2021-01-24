package keywords.practice;

public class ThisClass {
	int a;
	int b;
	int c;
	ThisClass(int a, int b){
		this.a = a;
		this.b = b;
	}
	ThisClass(int a, int b, int c){
		this(a,b);
		this.c = c;
	}
	void display() {
		System.out.println(a + " " + b + " " + c);
	}
}
