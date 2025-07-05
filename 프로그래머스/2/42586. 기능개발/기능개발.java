import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0; i<progresses.length; i++) {
            int duration = (100-progresses[i])/speeds[i]; 
            if((100-progresses[i])%speeds[i]>0) duration++;
            q.offer(duration);
        }
        
        int beforeDuration = q.poll();
        answer.add(1);
        
        while(!q.isEmpty()) {
            int currentDuration = q.poll();
            System.out.println(beforeDuration+" "+currentDuration);
            if(beforeDuration>=currentDuration) {
                answer.set(answer.size()-1, answer.get(answer.size()-1)+1);
            } else {
                answer.add(1);
                beforeDuration = currentDuration;
            }
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}