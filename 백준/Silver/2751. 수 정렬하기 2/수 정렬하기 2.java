import java.io.*;
import java.util.Arrays;

public class Main {		
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num;
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<n; i++) {
			sb.append(arr[i]).append("\n");
		}
		System.out.print(sb);
	}
}

