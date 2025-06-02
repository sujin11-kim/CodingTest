import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = new int[num_list.length];
        
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        if(n==1) return Arrays.copyOfRange(num_list, 0, b+1);
        else if(n==2) return Arrays.copyOfRange(num_list, a, num_list.length);
        else if(n==3) return Arrays.copyOfRange(num_list, a, b+1);
        else if(n==4) {
            int idx=0;
            for(int i=a; i<=b; i+=2) answer[idx++] = num_list[i];
            answer = Arrays.copyOf(answer, idx);
        }
        return answer;
    }
}