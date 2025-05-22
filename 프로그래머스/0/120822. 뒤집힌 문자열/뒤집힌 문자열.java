class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(char x: my_string.toCharArray()) answer = x+answer;
        return answer;
    }
}