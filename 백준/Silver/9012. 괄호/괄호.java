import java.util.*;

public class Main {
	static int[][] board = new int[9][9];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			String s = sc.nextLine();
			System.out.println(solution(s));
		}
		sc.close();
	}
	
	static String solution(String s) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();

		for(char c: s.toCharArray()) {
			if(c=='(') stack.push(c);
			else if(c==')') {
				 if(stack.isEmpty()) return "NO";
				 stack.pop();
			}
		}
		
		if(!stack.isEmpty()) return "NO";
		
		return answer;
	}
}
