import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {        
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for(int i=1; i<arr.length; i++) {
            if(stack.peek()!=arr[i]) stack.push(arr[i]);
        }
        
        int len = stack.size();
        int[] answer = new int[len];
        
        for(int i=0; i<len; i++) answer[len-i-1] = stack.pop();
        return answer;
    }
}