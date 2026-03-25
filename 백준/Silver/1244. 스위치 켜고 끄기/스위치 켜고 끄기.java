import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static int[] arr;

    public static void change(int x) {
        if(arr[x]==0) arr[x] = 1;
        else arr[x] = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n+1];
        for (int i =1; i < n+1; i++) {
            arr[i] = sc.nextInt();
        }
        int s = sc.nextInt();

        for (int i = 0; i < s; i++) {
            int sex =  sc.nextInt();
            int num = sc.nextInt();
            if(sex==1) {
                for(int j=num; j<arr.length; j+=num) {
                    change(j);
                }
            }
            else {
                change(num);

                int before = num - 1;
                int after = num + 1;
                while(before>0 && after<arr.length && arr[before]==arr[after]) {
                    change(before);
                    change(after);
                    before -= 1;
                    after += 1;
                }
            }
        }

        for(int i=1;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
            if(i%20==0) System.out.println();
        }
    }
}