import java.util.*;

public class Main {
	static int[][] board = new int[9][9];
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		T.solution(0, 0);
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
	
	static boolean solution(int row, int col) {
		if(col==9) return solution(row+1, 0);
		if(row==9) return true;
		
		if(board[row][col]!=0) return solution(row, col+1);
		
		for(int num=1; num<=9; num++) {
			if(isValid(row, col, num)) {
				board[row][col] = num;
				if(solution(row, col+1)) return true;
				board[row][col] = 0;
			}
		}
		
		return false;
	}
	
	static boolean isValid(int row, int col, int num) {
		for(int i=0; i<9; i++) {
			if(board[row][i] == num || board[i][col] == num) return false;
		}
		
		int startRow = (row/3)*3;
		int startCol = (col/3)*3;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(board[startRow+i][startCol+j]==num) return false;
			}
		}
		
		return true;
	}
}
