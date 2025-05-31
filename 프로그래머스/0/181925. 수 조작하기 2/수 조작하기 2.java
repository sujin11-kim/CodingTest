class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for(int i=1; i<numLog.length; i++){
            int comp =  numLog[i]-numLog[i-1];
            if(comp==1) answer+="w";
            else if(comp==-1) answer+="s";
            else if(comp==10) answer+="d";
            else if(comp==-10) answer+="a";
        }
        
        return answer;
    }
}