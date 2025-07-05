import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Queue<Integer> q = new LinkedList<>();
		for(int i=1; i<=n; i++) q.add(i);
		
		while(q.size()>1) {
			q.poll();
			q.offer(q.poll());
		}
		
		System.out.print(q.peek());
		
		sc.close();
	}
}

