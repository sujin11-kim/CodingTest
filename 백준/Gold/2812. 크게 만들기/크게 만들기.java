import java.util.*;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String num = sc.next();
		
		Deque<Integer> stack = new ArrayDeque<>();
		int removed = 0;
		
		for(int i=0; i<n; i++) {
			int x = num.charAt(i)-'0';
			
			while(!stack.isEmpty() && removed<k && x>stack.peekLast()) {
				stack.pollLast();
				removed++;
			}
			
			stack.addLast(x);
		}
		
		while(removed<k) {
			stack.pollLast();
			removed++;
		}

		for(int a: stack) System.out.print(a);
		
		sc.close();
	}
}
