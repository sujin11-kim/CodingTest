import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> triangle = new ArrayList<>();
		for(int i=1; i<=44; i++) {
			triangle.add(i*(i+1)/2);
		}
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int k = sc.nextInt();
			boolean flag = false;
			for(int j=0; j<44; j++) {
				for(int l=0; l<44; l++) {
					for(int m=0; m<44; m++) {
						if(k==triangle.get(j)+triangle.get(l)+triangle.get(m)) {
							System.out.println(1);
							flag = true;
						} 
					}
					if(flag) break;
				}
				if(flag) break;
			}
			if(!flag) System.out.println(0);
		}
		sc.close();
	}
}
