import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> answer = new ArrayList<>();
        StringBuilder tmp = new StringBuilder();
        for(char c: myStr.toCharArray()) {
            if(c=='a'|c=='b'|c=='c') {
                if(tmp.length()!=0) answer.add(tmp.toString());  
                tmp.setLength(0);
            } else tmp.append(c);
        }
        if(tmp.length()!=0) answer.add(tmp.toString());  
        if(answer.isEmpty()) answer.add("EMPTY");
        return answer.toArray(new String[0]);
    }
}