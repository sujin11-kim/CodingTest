class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int q=0; q<queries.length; q++){
            int s = queries[q][0];
            int e = queries[q][1];
            int k = queries[q][2];
            int min_num = Integer.MAX_VALUE;
            boolean flag = false;
            
            for(int i=s; i<=e; i++){
                if(arr[i]>k) {
                    min_num = Math.min(min_num, arr[i]);
                    flag = true;
                }
            }
            if(!flag) answer[q] = -1;
            else answer[q] = min_num;
        }
        return answer;
    }
}