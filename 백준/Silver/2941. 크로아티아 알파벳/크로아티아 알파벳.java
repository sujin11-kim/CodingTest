import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		for(String x: arr) s = s.replace(x, "_");
		int answer = s.length();
		System.out.print(answer);;
		sc.close();
	}
}
