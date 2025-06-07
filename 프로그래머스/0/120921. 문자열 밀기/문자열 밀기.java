class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        if(A.equals(B)) return answer;
        else {
            for(int i=1; i<A.length(); i++) {
                A = A.charAt(A.length()-1)+A.substring(0, A.length()-1);
                System.out.print(A);
                if(A.equals(B)) return i;
            }
            answer = -1;
        }
        return answer;
    }
}