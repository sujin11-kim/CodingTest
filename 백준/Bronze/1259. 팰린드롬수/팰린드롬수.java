import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String s = sc.next();
			if(s.equals("0")) break;
			
			int len = s.length();
			boolean flag = true;
			
			for(int i=0; i<len/2; i++) {
				if(s.charAt(i)!=s.charAt(len-1-i)) {
					flag = false;
					break;
				}
			}
			if(flag) System.out.println("yes");
			else System.out.println("no");
		}
		
		sc.close();
	}
}
