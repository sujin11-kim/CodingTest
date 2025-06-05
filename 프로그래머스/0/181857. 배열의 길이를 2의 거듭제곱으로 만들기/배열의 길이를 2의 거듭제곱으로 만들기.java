import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int x = 1, len = arr.length;
        
        while (x < len) x *= 2;
        int[] answer = new int[x];
        answer = Arrays.copyOf(arr, x);
        
        return answer;
    }
}