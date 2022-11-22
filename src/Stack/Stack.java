package Stack;

public class Stack {
	int S[] = new int[10];
	int top = -1;                      // making stack null
	
	void push(int x) {
		top = top + 1;
		S[top] = x;
	}
	
	int pop() {
		int x = S[top];
		top = top - 1;
		return x;
	}
	
	int peak() {
		return S[top];
	}

	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(1); st.push(5); st.push(2);
		System.out.printf("Top = %d", st.top);
		int x = st.pop();
		System.out.printf("\nx = pop() = %d", x);
		st.peak();
		System.out.printf("\nTop = %d", st.top);
		
	}

}
