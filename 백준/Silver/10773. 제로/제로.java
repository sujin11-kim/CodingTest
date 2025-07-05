import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<k; i++) {
			int num = sc.nextInt();
			if(num==0) stack.pop();
			else stack.push(num);
		}
		
		int sum = 0;
		for(int x: stack) {
			sum += x;
		}
		
		System.out.print(sum);
		
		sc.close();
	}
}

