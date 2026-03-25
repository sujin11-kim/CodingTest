import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int n = sc.nextInt();
            for(int j=0; j<n; j++) {
                int num = sc.nextInt();
                min = Math.min(min, num);
                max = Math.max(max, num);
            }
            System.out.println(min+" "+max);
        }
    }
}