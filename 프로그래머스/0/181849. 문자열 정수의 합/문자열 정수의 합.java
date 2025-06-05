class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for(char n: num_str.toCharArray()) {
            answer += Integer.parseInt(Character.toString(n));
        }
        return answer;
    }
}