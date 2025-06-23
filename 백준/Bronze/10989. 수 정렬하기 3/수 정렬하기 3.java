import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int[] count = new int[10001]; // 입력 숫자의 범위: 1 ~ 10000

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			count[num]++;
		}

		for (int i = 1; i <= 10000; i++) {
			while (count[i]-- > 0) {
				sb.append(i).append("\n");
			}
		}

		System.out.print(sb);
	}
}