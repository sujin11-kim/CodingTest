import java.util.Scanner;

public class Main {
    static int[][] arr = new int[5][5];

    public static boolean binggo () {
        int answer = 0;

        for (int i = 0; i < 5; i++) {
            int count = 0;
            for(int j=0; j<5; j++) {
                if(arr[i][j]==0) count++;
            }
            if(count==5) answer++;
        }

        for (int i = 0; i < 5; i++) {
            int count = 0;
            for(int j=0; j<5; j++) {
                if(arr[j][i]==0) count++;
            }
            if(count==5) answer++;
        }

        int count = 0;
        for (int i = 0; i < 5; i++) {
            if(arr[i][i]==0) count++;
        }
        if(count==5) answer++;

        count = 0;
        for(int i=0; i<5; i++) {
            if(arr[i][4-i]==0) count++;
        }
        if(count==5) answer++;

        return answer >= 3;
    }

    public static void check(int num) {
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                if (arr[i][j]==num) {
                    arr[i][j]=0;
                    return;
                }
            }
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=1; i<26; i++) {
            int num = sc.nextInt();
            check(num);
            if(binggo()) {
                System.out.println(i);
                break;
            }
        }
    }
}