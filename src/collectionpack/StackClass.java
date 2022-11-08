package collectionpack;

import java.util.Iterator;
import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<>();

		stk.push(5);
		stk.push(7);
		stk.push(3);
		stk.push(2);

		int ab = stk.pop();
		System.out.println(ab);
		int cd = stk.pop();
		System.out.println(cd);
		stk.add(55);

		int hy = stk.get(0);
		System.out.println(hy);
		Iterator<Integer> itr = stk.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
