package data.structures;

class Stack {
	
	int top;
	int stack[] = new int[10];
	
	Stack() {
		top = -1;
	}
	
	boolean isFull() {
		if(top == 9)
			return true;
		else
			return false;
	}
	
	boolean isEmpty() {
		if(top == -1)
			return true;
		else 
			return false;
	}
	
	void push(int element) {
		if(isFull()) {
			System.out.println("Stack full");
		}
		else {
			stack[++top] = element;
		}
	}
	
	void pop() {
		if(isEmpty()) {
			System.out.println("Stack empty");
		}
		else {
			System.out.println(stack[top--] + " popped");
		}
	}
	void print() {
		if(isEmpty()) {
			System.out.println("Stack empty");
		}
		else {
			for(int i=0;i<=top;i++) {
				System.out.println(stack[i]);
			}
		}
	}

}
