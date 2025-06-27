import java.util.*;

public class Main {	
	static class Pair {
		int num;
		String commands;
	
		Pair(int num, String commands) {
			this.num = num;
			this.commands = commands;
		}
	}
	
	static void DFS(int start, int target) {
		boolean[] visited = new boolean[10000];
		Queue<Pair> q = new LinkedList<>();
		q.offer(new Pair(start, ""));
		visited[start] = true;
		
		while(!q.isEmpty()) {
			Pair current = q.poll();
			int num = current.num;
			String commands = current.commands;
			
			if(num==target) {
				System.out.println(commands);
				return;
			}
			
			int D = num*2%10000;
			int S = num==0 ? 9999 : num-1;
			int L = (num%1000)*10 + num/1000;
			int R = (num%10)*1000 + num/10;
			
			if(!visited[D]) {
				visited[D] = true;
				q.offer(new Pair(D, commands+"D"));
			}
			
			if(!visited[S]) {
				visited[S] = true;
				q.offer(new Pair(S, commands+"S"));
			}
			
			if(!visited[L]) {
				visited[L] = true;
				q.offer(new Pair(L, commands+"L"));
			}
			
			if(!visited[R]) {
				visited[R] = true;
				q.offer(new Pair(R, commands+"R"));
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			DFS(a, b);
		}
		
		sc.close();
	}
}

