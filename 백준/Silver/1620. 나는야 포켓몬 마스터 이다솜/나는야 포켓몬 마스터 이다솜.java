import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, String> integerMap = new HashMap<>();
        Map<String, Integer> stringMap = new HashMap<>();
        for(int i=1; i<n+1; i++) {
            String s = sc.next();
            integerMap.put(i, s);
            stringMap.put(s, i);
        }
        for(int i=0; i<m; i++) {
            String tmp = sc.next();
            if(stringMap.containsKey(tmp)) System.out.println(stringMap.get(tmp));
            else if(integerMap.containsKey(Integer.parseInt(tmp))) System.out.println(integerMap.get(Integer.parseInt(tmp)));
        }
    }
}
