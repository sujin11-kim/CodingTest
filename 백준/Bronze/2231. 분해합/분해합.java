import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<n; i++) {
			int num = i;
			for(char x: String.valueOf(i).toCharArray()) num+=(x-'0');
			if(num==n) {
				System.out.print(i);
				sc.close();
				return;
			}
		}

		System.out.print("0");
		sc.close();
	}
}
