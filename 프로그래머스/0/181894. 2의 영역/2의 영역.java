import java.util.Arrays;


class Solution {
    public int[] solution(int[] arr) {
        int min_idx = 1000000;
        int max_idx = -1;
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==2) {
                min_idx = Math.min(min_idx, i);
                max_idx = Math.max(max_idx, i);
            }
        }
        return min_idx <= max_idx ? Arrays.copyOfRange(arr, min_idx, max_idx+1) : new int[]{-1};
    }
}