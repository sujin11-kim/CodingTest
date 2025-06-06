import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> set = new HashSet<>();
        for(int n: delete_list) set.add(n);
        
        int[] answer = new int[arr.length];
        int idx = 0;
        for(int n: arr) {
            if(!set.contains(n)) answer[idx++] = n;
        }
        
        return Arrays.copyOf(answer, idx);
    }
}