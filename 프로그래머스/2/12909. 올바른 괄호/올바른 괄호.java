import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Queue<Character> q = new LinkedList<>();
        for(char c: s.toCharArray()) {
            if(c=='(') q.offer(c);
            else {
                if(q.isEmpty()) return false;
                else q.poll();
            }
        }
        if(!q.isEmpty()) return false;

        return answer;
    }
}