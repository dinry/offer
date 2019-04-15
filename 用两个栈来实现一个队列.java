package sword2offer;
import java.util.Stack;

public class offer5 {
	Stack<Integer> stack1=new Stack<Integer>();
	Stack<Integer> stack2=new Stack<Integer>();
	public void push(int node) {
		stack1.push(node);
	}
	public int pop() {
		if(stack2.empty()) {
			while(stack1.empty()!=true) {
				stack2.push(stack1.pop());
			}
		}
		if(stack2.empty()==true) {
			return -1;
		}
		return stack2.pop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		offer5 offer=new offer5();
		offer.push(1);
		offer.push(2);
		offer.push(5);
		offer.push(7);
		int c=offer.pop();
		System.out.println(c);

	}

}
