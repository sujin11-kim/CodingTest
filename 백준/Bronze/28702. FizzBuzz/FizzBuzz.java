import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		
		int answer = 0;
		if(isNumber(a)) {
			answer = Integer.parseInt(a)+3;	
		} else if(isNumber(b)) {
			answer = Integer.parseInt(b)+2;				
		} else if(isNumber(c)) {
			answer = Integer.parseInt(c)+1;				
		}
		
		fizzbuzz(answer);
	}
	
	static boolean isNumber(String s) {
		return !(s.equals("Fizz") || s.equals("Buzz") ||s.equals("FizzBuzz"));
	}
	
	static void fizzbuzz(int n) {
		if(n%3==0 && n%5==0) System.out.println("FizzBuzz");
		else if(n%3==0) System.out.println("Fizz");
		else if(n%5==0) System.out.println("Buzz");
		else System.out.println(n);
	}
}

