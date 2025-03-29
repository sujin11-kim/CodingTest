import java.util.*;

class Main {
    public int solution(String s) {
    	s = s.trim();
    	if (s.isEmpty()) return 0;
        return s.split("\\s+").length;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        System.out.print(T.solution(s));
        kb.close();
    }
}