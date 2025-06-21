import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i=0; i<t; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			
			int[] arr = new int[n+1];
			
			for(int h=1; h<n+1; h++) arr[h] = h;
			
			for(int f=0; f<k; f++) {
				for(int h=1; h<n+1; h++) {
					arr[h] = arr[h-1] + arr[h];
				}
			}
			System.out.println(arr[n]);
		}
		
		sc.close();
	}
}

