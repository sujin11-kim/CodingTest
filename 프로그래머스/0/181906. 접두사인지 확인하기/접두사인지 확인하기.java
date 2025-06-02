class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int len = my_string.length();
        
        for(int i=0; i<len; i++) {
            String prefix = my_string.substring(0,len-i);
            if(prefix.equals(is_prefix)) return 1;
        }
        return answer;
    }
}