import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] len = new int[strArr.length];
        
        for(String s: strArr) len[s.length()]++;
        
        for(int l: len) answer = Math.max(l, answer);
        
        return answer;
    }
}