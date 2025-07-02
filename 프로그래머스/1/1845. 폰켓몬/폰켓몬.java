import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums) map.put(n, map.getOrDefault(n, 0)+1);
        
        int pickNum = nums.length/2;
        if(map.size()>=pickNum) answer=pickNum;
        else answer=map.size();
        
        return answer;
    }
}