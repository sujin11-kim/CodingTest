class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        
        for(int x: num_list){
            if(x%2 == 0) even.append(x);
            else odd.append(x);
        }
        
        answer = Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());
        return answer;
    }
}