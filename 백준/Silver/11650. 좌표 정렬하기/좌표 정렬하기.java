import java.util.*;

public class Main {
	static class Point {
		public int x, y;
		
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Point> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			list.add(new Point(x, y));
		}
		
		list.sort((a,b) -> {
			if(a.x==b.x) return a.y-b.y;
			return a.x-b.x;
		});
		for(int i=0; i<n; i++) {
			System.out.println(list.get(i).x+" "+list.get(i).y);
		}
		sc.close();
	}
}
