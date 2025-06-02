class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i=65; i<=90; i++) {
            for(char c: my_string.toCharArray()) {
                if(c==i) answer[i-65]++;
            }
        }
        
        for(int i=97; i<=122; i++) {
            for(char c: my_string.toCharArray()) {
                if(c==i) answer[i-71]++;
            }
        }
        return answer;
    }
}