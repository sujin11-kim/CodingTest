import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
       
        int[] arr = {a, b, c, d};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x: arr) map.put(x, map.getOrDefault(x,0)+1);
        
        int map_size = map.size();
        
        int p=0, q=0, r=0;
        if (map_size==1) {
            return 1111*a;
        }
        else if (map_size==2) {
            for (int k: map.keySet()) {
                if(map.get(k)==3) {
                    p=k;
                    for(int key: map.keySet()) if(map.get(key)==1) q=key;
                    return (int) Math.pow(10*p+q, 2);
                }
                if(map.get(k)==2) {
                    Iterator<Integer> it = map.keySet().iterator();
                    p = it.next();
                    q = it.next();
                    return (p+q)*Math.abs(p-q);
                }
            }
        }
        else if (map_size==3) {
            for(int k: map.keySet()){
                if(map.get(k)==1) {
                    if(q==0) q=k;
                    else r=k;
                }
            }
            return q*r;
        }
        else return Math.min(Math.min(a, b), Math.min(c,d));
        
        return answer;
    }
}