import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        int len = my_string.length();
        String[] answer = new String[len];
        for(int i=1; i<=len; i++) answer[i-1] = my_string.substring(len-i, len);
        Arrays.sort(answer);
        return answer;
    }
}