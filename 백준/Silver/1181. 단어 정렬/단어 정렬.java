import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		List<String> list = new ArrayList<>();
		Set<String> set = new HashSet<>();
		
		for(int i=0; i<n; i++) {
			String s = sc.next();
			if(set.add(s)) list.add(s);
		}
		
		list.sort((a,b) -> {
			if(a.length()==b.length()) return a.compareTo(b);
			return a.length() - b.length();
		});
		
		for(String s: list) System.out.println(s);
	}
}

