import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> seen = new HashSet<>();
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        
        int idx = 0;
        for(int n: arr) {
            if(!seen.contains(n)) {
                answer[idx++] = n;
                seen.add(n);
            }  
            if(idx==k) break;
        }
        
        return answer;
    }
}