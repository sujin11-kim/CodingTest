import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		int col = sc.nextInt();
		sc.nextLine();
		
		char[][] board = new char[row][col];
		
		for(int i=0; i<row; i++) {
			String s = sc.nextLine();
			for(int j=0; j<col; j++) {
				board[i][j] = s.charAt(j);
			}
		}
	
		int answer = Integer.MAX_VALUE;
		
		for(int i=0; i<=row-8; i++) {
			for(int j=0; j<=col-8; j++) {
				int countB = 0, countW = 0;
				for(int x=0; x<8; x++) {
					for(int y=0; y<8; y++) {
						if((x+y)%2==0) {
							if(board[i+x][j+y]!='B') countB++;
							if(board[i+x][j+y]!='W') countW++;	
						} else {
							if(board[i+x][j+y]!='W') countB++;
							if(board[i+x][j+y]!='B') countW++;
						}						
					}
				}
				answer = Math.min(answer, countB);
				answer = Math.min(answer, countW);
			}
		}
		
		System.out.print(answer);
		sc.close();
	}
}