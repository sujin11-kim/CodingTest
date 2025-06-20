import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int[] check = new int[10];
		
		int result = a*b*c;
		for(char x: Integer.toString(result).toCharArray()) {
			int idx = Integer.parseInt(Character.toString(x));
			check[idx]++;
		}
		for(int i: check) {
			System.out.println(i);
		}
		sc.close();
	}
}
