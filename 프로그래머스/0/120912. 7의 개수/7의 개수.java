class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int n: array) {
            for(char c: String.valueOf(n).toCharArray()) {
                if(c=='7') answer++;
            }
        }
        return answer;
    }
}