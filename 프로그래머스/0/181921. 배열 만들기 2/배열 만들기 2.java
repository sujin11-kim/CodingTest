import java.util.*;

class Solution {
    List<Integer> answer = new ArrayList<>();
    
    public void DFS(String current, int l, int r) {
        if(!current.isEmpty()) {
        if (current.startsWith("0") && current.length() > 1) return;
            int num = Integer.parseInt(current);
            if(num>r) return;
            if(num>=l) answer.add(num);
        }
        
        if (current.length() >= 7) return;
        
        DFS(current+"0", l, r);
        DFS(current+"5", l, r);
    }
    
    public int[] solution(int l, int r) {
        DFS("", l, r);
        
        if(answer.isEmpty()) return new int[]{-1};
        
        Collections.sort(answer);
        return answer.stream().mapToInt(i -> i).toArray();
    }
}