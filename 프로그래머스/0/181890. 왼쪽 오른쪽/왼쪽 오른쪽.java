import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        int len = str_list.length;
        String[] answer = new String[len];
        
        for (int i=0; i<len; i++) {
            if(str_list[i].equals("l")) return Arrays.copyOfRange(str_list, 0, i);
            else if(str_list[i].equals("r")) return Arrays.copyOfRange(str_list, i+1, len);
        }
        return new String[0];
    }
}