import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<flag.length; i++) {
            if(flag[i]) {
                for(int count=0; count<arr[i]*2; count++) answer.add(arr[i]);
            }
            else for(int count=0; count<arr[i]; count++) answer.remove(answer.size()-1);
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}