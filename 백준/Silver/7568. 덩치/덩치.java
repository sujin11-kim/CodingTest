import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		
		for(int i=0; i<n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			int rank = 1;
			for(int j=0; j<n; j++) {
				if(i==j) continue;
				if(arr[j][0]>arr[i][0] && arr[j][1]>arr[i][1]) rank++;
			}
			System.out.print(rank+" ");
		}
		sc.close();
	}
}

