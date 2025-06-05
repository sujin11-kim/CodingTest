import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        int len = 0;
        for(boolean f: attendance) if(f) len++;
        int[] attendance_rank = new int[len];
        
        int idx = 0;
        for(int i=0; i<rank.length; i++) {
            if(attendance[i]) attendance_rank[idx++] = rank[i];
        }
        Arrays.sort(attendance_rank);
        
        
        int a = 0, b = 0, c = 0;
        for(int i =0; i<rank.length; i++) {
            if(attendance_rank[0]==rank[i]) a = i;
            else if(attendance_rank[1]==rank[i]) b = i;
            else if(attendance_rank[2]==rank[i]) c = i;
        }
        
        answer = 10000*a + 100*b + c;
        return answer;
    }
}