class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int odd_num=0, even_num=0;
        for(int i=0; i<num_list.length; i++) {
            if((i+1)%2==0) even_num+=num_list[i];
            else odd_num+=num_list[i];
        }
        answer = Math.max(odd_num, even_num);
        return answer;
    }
}