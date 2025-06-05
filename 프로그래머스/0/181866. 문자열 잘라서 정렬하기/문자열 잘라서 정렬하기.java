import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] parts = myString.split("x"); 
        List<String> filtered = new ArrayList<>();

        for (String part : parts) {
            if (!part.isEmpty()) {
                filtered.add(part);
            }
        }

        Collections.sort(filtered); 
        return filtered.toArray(new String[0]);  
    }
}
