import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> stk = new ArrayList<>();
        int i=0;
        while(i<arr.length) {
            if(stk.isEmpty()) stk.add(arr[i++]);
            else {
                if(stk.get(stk.size()-1)==arr[i]) {
                    stk.remove(stk.size()-1);
                    i++;
                } else {
                    stk.add(arr[i++]);
                }
            }
        }
        answer = stk.isEmpty() ? new int[]{-1} : stk.stream().mapToInt(j->j).toArray();
        return answer;
    }
}