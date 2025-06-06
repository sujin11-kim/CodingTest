class Solution {
    public int solution(int[][] arr) {
        int answer = 1;
        int len = arr.length;
        boolean flag = true;
        for(int i=0; i<=len/2; i++) {
            for(int j=0; j<=len/2; j++) {
                if(arr[i][j]!=arr[j][i]) return 0;
            }
        }
        return answer;
    }
}