class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int len = common.length-1;
        
        double n1=common[0], n2=common[1], n3=common[2];
        
        if(n2-n1==n3-n2) {
            answer = (int) (n2-n1)+common[len];
        }
        
        double r1 = n2/n1, r2 = n3/n2;
        System.out.print(r1);
        if(r1==r2) {
            answer = (int) (common[len]*r1);
        }
    
        return answer;
    }
}