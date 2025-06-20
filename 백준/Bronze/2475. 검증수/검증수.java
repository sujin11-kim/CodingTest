import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		for(int i=0; i<5; i++) {
			int num = sc.nextInt();
			answer += num*num;
		}
		answer = answer%10;
		System.out.print(answer);
		sc.close();
	}
}
