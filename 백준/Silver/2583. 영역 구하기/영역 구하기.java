import java.util.*;

class Point {
	public int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class Main {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int n, m;
	
	public void BFS(int[][] arr) {
		Queue<Point> q = new LinkedList<>(); 
		int count = 0;
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int x=0; x<n; x++) {
			for(int y=0; y<m; y++) {
				if(arr[x][y]==0) {
					arr[x][y] = 1;
					count++;
					int area = 1;
					q.offer(new Point(x, y));
					while(!q.isEmpty()) {
						Point tmp = q.poll();
						for(int i=0; i<4; i++) {
							int nx = tmp.x + dx[i];
							int ny = tmp.y + dy[i];
							if(nx>=0 && nx<n && ny>=0 && ny<m && arr[nx][ny]==0) {
								arr[nx][ny] = 1;
								q.offer(new Point(nx, ny));
								area++;
							}
						}
					}
					answer.add(area);
				}
			}
		}
		System.out.println(count);
		Collections.sort(answer);
		for(int i=0; i<answer.size(); i++) System.out.print(answer.get(i)+" ");
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int[][] arr = new int[n][m];
		int k = sc.nextInt();
		for(int i=0; i<k; i++) {
			int lx = sc.nextInt();
			int ly = sc.nextInt();
			int rx = sc.nextInt();
			int ry = sc.nextInt();
			for(int row=ly; row<ry; row++) {
				for(int col=lx; col<rx; col++) {
					arr[row][col] = 1;
				}
			}
		}
		T.BFS(arr);
		sc.close();
	}
}
