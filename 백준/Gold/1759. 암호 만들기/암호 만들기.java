import java.util.*;

public class Main {
	static int L, C;
	static char[] answer, arr;
	static char[] vowel = {'a', 'e', 'i', 'o', 'u'};
	
	public void DFS(int depth, int start) {
		if(depth == L) {
			int count = 0;
			for(char c: answer) {
				for(char v: vowel) {
					if(c==v) count++;
				}
			}
			if(count>=1 && L-count>=2) {
				for(int i=0; i<L; i++) System.out.print(answer[i]);
				System.out.println();
			}
			return;
		} else {
			for(int i=start; i<C; i++) {
				answer[depth] = arr[i];
				DFS(depth+1, i+1);
			}
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		L = sc.nextInt();
		C = sc.nextInt();
		arr = new char[C];
		for(int i=0; i<C; i++) arr[i] = sc.next().charAt(0);
		Arrays.sort(arr);
		answer = new char[L];
		T.DFS(0, 0);
		sc.close();
	}
}
