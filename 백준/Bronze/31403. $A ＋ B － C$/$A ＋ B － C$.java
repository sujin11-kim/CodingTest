import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(a+b-c);
		
		String strAB = Integer.toString(a)+Integer.toString(b);
		int answer = Integer.parseInt(strAB) - c;
		System.out.println(answer);
		sc.close();
	}
}
