import java.math.*;
import java.util.*;

public class Main {	
	static BigInteger Factorial(int n) {
		BigInteger result = BigInteger.ONE;
		for(int i=2; i<=n; i++) result = result.multiply(BigInteger.valueOf(i));
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String fNum = String.valueOf(Factorial(n));

		int i=fNum.length()-1;		
		while(fNum.charAt(i)-'0'==0) i--;
		
		System.out.print(fNum.length()-1-i);
		sc.close();
	}
}

