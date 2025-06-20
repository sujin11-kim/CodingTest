import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int num = sc.nextInt();
			if(solution(num)) answer++;
		}
		System.out.print(answer);
		sc.close();
	}
	
	static boolean solution(int n) {
		if(n==1) return false;
		
		for(int i=2; i<n; i++) {
			if(n%i==0) return false;
		}
		
		return true;
	}
}
