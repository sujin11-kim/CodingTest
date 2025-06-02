class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int len = my_string.length();
        for (int i=1; i<=len; i++) {
            String suffix = my_string.substring(len-i, len);
            if(suffix.equals(is_suffix)) return 1;
        }
        return answer;
    }
}