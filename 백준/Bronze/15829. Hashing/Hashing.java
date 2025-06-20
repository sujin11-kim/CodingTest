import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		String s = sc.next();
		int r = 1;
		int m = 1234567891;
		int answer = 0;
		
		for(int i=0; i<l; i++) {
			int a = s.charAt(i)-'a'+1;
			answer += a*r;
			r*=31;
		}
		answer%=m;
		System.out.print(answer);
		
		sc.close();
	}
}
