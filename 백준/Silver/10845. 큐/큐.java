import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Queue<Integer> q = new LinkedList<>();

		int last = 0;
		int result = 0;
		for(int i=0; i<n; i++) {
			String s = sc.next();
			if(s.equals("push")) {
				last = sc.nextInt();
				q.offer(last);
				continue;
			} else if(s.equals("pop")) {
				result = q.isEmpty() ? -1 : q.poll();
			} else if(s.equals("size")) {
				result = q.size();
			} else if(s.equals("empty")) {
				result = q.isEmpty() ? 1 : 0;
			} else if(s.equals("front")) {
				result = q.isEmpty() ? -1 : q.peek();
			} else if(s.equals("back")) {
				result = q.isEmpty() ? -1 : last;
			}
			
			System.out.println(result);
		}
		
		sc.close();
	}
}