import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[1000];
        int idx = 0;
        answer[idx++] = n;
        
        while(n!=1) {
            if(n%2==0) n/=2;
            else n=3*n+1;
            answer[idx++] = n;
        }
        return Arrays.copyOf(answer, idx);
    }
}