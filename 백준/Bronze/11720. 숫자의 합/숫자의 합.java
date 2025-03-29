import java.util.*;

class Main {
    public int solution(int n, String s) {
        int result = 0;
        for(char x: s.toCharArray()) {
            result+= Integer.parseInt(String.valueOf(x));
        }
        return result;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String s = kb.next();
        System.out.print(T.solution(n, s));
        kb.close();
    }
}