class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = 0;
        boolean flag = true;
        
        while(flag) {
            int sum = 0;
            for(int i=0; i<num; i++) sum += start+i;  
            if(sum==total) {
                flag = false;
                break;
            } else if(sum>total) start--;
            else start++;
        }
        
        for(int i=0; i<num; i++) answer[i] = start++;
                
        return answer;
    }
}