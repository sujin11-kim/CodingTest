import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		int sum = 0;	
		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		Arrays.sort(arr);
		boolean found = false;
		for(int i=0; i<9; i++) {
			for(int j=i+1; j<9; j++) {
				if(sum-arr[i]-arr[j]==100) {
					for(int k=0; k<9; k++) {
						if(k!=i && k!=j) System.out.println(arr[k]);
					}
					found = true;
					break;
				}
			}
			if(found) break;
 		}
		sc.close();
	}
}
