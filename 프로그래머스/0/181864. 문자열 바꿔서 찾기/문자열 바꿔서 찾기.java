class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder replacedString = new StringBuilder();
        for(char c: myString.toCharArray()) {
            if(c=='A') replacedString.append('B');
            else if(c=='B') replacedString.append('A');
        }
        answer = replacedString.toString().contains(pat) ? 1 : 0;
        return answer;
    }
}