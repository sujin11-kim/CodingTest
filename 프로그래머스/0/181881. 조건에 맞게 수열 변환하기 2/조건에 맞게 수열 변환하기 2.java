import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int x = 0;
        int len = arr.length;
        
        int[] comp = new int[len];
        boolean flag = true;
        
        while(flag) {
            comp = Arrays.copyOf(arr, len);
            
            for(int idx=0; idx<len; idx++) {
                if(arr[idx]>=50 && arr[idx]%2==0) arr[idx] = arr[idx]/2;
                else if(arr[idx]<50 && arr[idx]%2!=0) arr[idx] = arr[idx]*2+1; 
            }
            
            int count = 0;
            for(int i=0; i<len; i++) {
                if(comp[i]==arr[i]) count++;
            }
            
            if(count==len) {
                answer = x;
                flag = false;
            } 
            x++;
        }
        
        return answer;
    }
}