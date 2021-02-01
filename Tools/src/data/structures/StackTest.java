package data.structures;

public class StackTest {
	public static void main(String[] args) {
		Stack st = new Stack();
		st.print();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		st.push(7);
		st.push(8);
		st.push(9);
		st.push(10);
		st.push(11);
		st.print();
		st.pop();
		st.print();
	}
}
