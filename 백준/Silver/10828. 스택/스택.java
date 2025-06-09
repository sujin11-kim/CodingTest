import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<n; i++) {
			String s = sc.next();
			int num = 0;
			if(s.equals("push")) {
				stack.push(sc.nextInt());
			} else if(s.equals("pop")) {
				num = stack.isEmpty() ? -1 : stack.pop();
				System.out.println(num);
			} else if(s.equals("size")) {
				num = stack.size();
				System.out.println(num);
			} else if(s.equals("empty")) {
				num = stack.isEmpty() ? 1 : 0;
				System.out.println(num);
			} else if(s.equals("top")) {
				num = stack.isEmpty() ? -1 : stack.peek();
				System.out.println(num);
			}
		}
		sc.close();
	}
}
