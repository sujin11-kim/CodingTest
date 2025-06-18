import java.util.*;

public class Main {
	public String solution(String s) {
		String answer = "yes";
		
		Stack<Character> stack = new Stack<>();
		
		for(char c: s.toCharArray()) {
			if(c=='(' || c=='[') stack.push(c);
			else if(c==')') {
				if(stack.isEmpty() || stack.pop()!='(') return "no";
			} else if(c==']') {
				if(stack.isEmpty() || stack.pop()!='[') return "no";
			}
		}
		if(!stack.isEmpty()) answer = "no";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		while(true) {
			String s = sc.nextLine();
			if(s.equals(".")) break;
			else System.out.println(T.solution(s));
		}
		sc.close();
	}
}
