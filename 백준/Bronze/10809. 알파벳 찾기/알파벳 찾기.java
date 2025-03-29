
import java.util.*;

class Main {
    public void solution(String s) {
    	for(int i=97; i<=122; i++) {
    		System.out.print(s.indexOf((char) i) + " ");
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        T.solution(s);
        kb.close();
    }
}