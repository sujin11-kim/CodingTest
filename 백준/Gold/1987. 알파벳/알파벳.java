import java.util.*;

public class Main {
	static int R, C;
	static char[][] board;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static Set<Character> set = new HashSet<>();
	static int answer = 0;
	
	public void DFS(int depth, int x, int y) {
		answer = Math.max(answer, depth);
		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx>=0 && nx<R && ny>=0 && ny<C && !set.contains(board[nx][ny])) {
				set.add(board[nx][ny]);
				DFS(depth+1, nx, ny);
				set.remove(board[nx][ny]);
			}
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		R = sc.nextInt();
		C = sc.nextInt();
	    sc.nextLine();
	    
		board = new char[R][C];
		for(int i=0; i<R; i++) {
			String s = sc.nextLine();
			for(int j=0; j<C; j++) {
				board[i][j]=s.charAt(j);
			}
		}
		set.add(board[0][0]);
		T.DFS(1, 0, 0);
		System.out.print(answer);
		sc.close();
	}
}
