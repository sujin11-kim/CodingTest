import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> answer = new ArrayList<>();
        
        StringBuilder tmp = new StringBuilder();
        for(String s: picture) {
            for(char c: s.toCharArray()) {
                for(int i=0; i<k; i++) tmp.append(c);
            }
            for(int i=0; i<k; i++) answer.add(tmp.toString());
            tmp.setLength(0);
        }
        
        return answer.toArray(new String[0]);
    }
}