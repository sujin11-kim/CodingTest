import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] chars = my_string.toLowerCase().toCharArray();
        Arrays.sort(chars);
        String answer = String.valueOf(chars);
        return answer;
    }
}