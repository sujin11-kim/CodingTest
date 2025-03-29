import java.util.*;

class Main {
    public void solution(int r, String s) {
    	for(char x: s.toCharArray()) {
            for(int i=0; i<r; i++) {
                System.out.print(x);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n= kb.nextInt();
        for(int i=0; i<n; i++) {
            int r = kb.nextInt();
            String s = kb.next();
            T.solution(r, s);
        }
        kb.close();
    }
}