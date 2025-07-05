import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		Queue<Integer> q = new LinkedList<>();
		for(int i=1; i<=n; i++) q.offer(i);
		
		System.out.print("<");
		while(!q.isEmpty()) {
			for(int i=1; i<k; i++) q.offer(q.poll());
			System.out.print(q.poll());
			if(!q.isEmpty()) System.out.print(", ");
		}
		System.out.print(">");
		sc.close();
	}
}
