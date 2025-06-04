class Solution {
    public String[] solution(String[] names) {
        int len = 0;
        if (names.length%5!=0) len = names.length/5+1;
        else len = names.length/5;
        
        String[] answer = new String[len];
        
        for(int i=0; i<len; i++) {
            answer[i] = names[i*5];
        }
        
        return answer;
    }
}