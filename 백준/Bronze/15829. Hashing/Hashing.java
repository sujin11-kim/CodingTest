
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		String s = sc.next();
		int r = 1;
		int m = 1234567891;
		long answer = 0;
		
		for(int i=0; i<l; i++) {
			int a = s.charAt(i)-'a'+1;
			answer = answer + (long) a*r % m;
			r = (int)((long)r * 31 % m); 
		}
		answer = (long) answer%m;
		System.out.print(answer);
		
		sc.close();
	}
}
