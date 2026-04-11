import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for (char c : s.toCharArray()){
            if ('<' == c) {
                System.out.print(sb.reverse());
                System.out.print('<');
                sb = new StringBuilder();
                flag = true;
            } else if ('>' == c) {
                System.out.print(sb + ">");
                sb = new StringBuilder();
                flag = false;
            } else if (!flag && c == ' ') {
                System.out.print(sb.reverse()+" ");
                sb = new StringBuilder();
            } else if (flag && c == ' ') {
                System.out.print(sb+" ");
                sb = new StringBuilder();
            } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')
            ) {
                sb.append(c);
            }
        }
        if (sb.length() > 0) System.out.println(sb.reverse());
    }
}
