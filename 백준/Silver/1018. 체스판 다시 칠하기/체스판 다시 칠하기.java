import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		char[][] board = new char[n][m];
		for(int i=0; i<n; i++) {
			String s = sc.next();
			for(int j=0; j<m; j++) {
				board[i][j] = s.charAt(j);
			}
		}
		
		int answer = Integer.MAX_VALUE;
		
		for(int i=0; i<=n-8; i++) {
			for(int j=0; j<=m-8; j++) {
				int count1 = 0;
				int count2 = 0;
				for(int x=0; x<8; x++) {
					for(int y=0; y<8; y++) {
						if((x+y)%2==0 && board[i+x][j+y]!='W') count1++;
						else if((x+y)%2!=0 && board[i+x][j+y]!='B') count1++;
						

						if((x+y)%2==0 && board[i+x][j+y]!='B') count2++;
						else if((x+y)%2!=0 && board[i+x][j+y]!='W') count2++;
					}
				}
				answer = Math.min(answer, Math.min(count1, count2));
			}
		}
		System.out.print(answer);
		sc.close();
	}
}