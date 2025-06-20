import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(solution(h, w, n));
		}
		
		sc.close();
	}
	
	static String solution(int h, int w, int n) {
		int resultH = n%h;
		int resultW = n/h;
		if(n%h==0) resultH = h;
		else resultW++;
		String strW = Integer.toString(resultW);
		if(strW.length()<2) strW = "0"+strW;
		String answer = Integer.toString(resultH)+strW;
		return answer;
	}
}