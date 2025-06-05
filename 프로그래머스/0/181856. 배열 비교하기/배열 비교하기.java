class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int len1 = arr1.length, len2 = arr2.length;
        
        if(len1>len2) answer = 1;
        else if(len2>len1) answer = -1;
        else {
            int sum1 = 0, sum2 = 0;
            for(int x: arr1) sum1 += x;
            for(int x: arr2) sum2 += x;
            
            if(sum1>sum2) answer = 1;
            else if(sum2>sum1) answer = -1;
            else answer = 0;
        }
        return answer;
    }
}