import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[6];
		for(int i=0; i<6; i++) {
			arr[i] = sc.nextInt();
		}
		int t = sc.nextInt();
		int p = sc.nextInt();
		
		int clothes = 0;
		for(int x: arr) {
			clothes += x%t==0 ? x/t : x/t+1;
		}
		System.out.println(clothes);
		
		System.out.println(n/p+" "+n%p);
		sc.close();
	}
}
