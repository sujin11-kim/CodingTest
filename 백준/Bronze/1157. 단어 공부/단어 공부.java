import java.util.*;

class Main {
    public void solution(String s) {
    	int[] arr = new int[26];
    	for(char x: s.toCharArray()) {
    		arr[((int) x)-65]++;
    	}
    	
    	int max = 0;
    	int maxIdx = -1;
    	boolean isDuplicated = false;
    	
    	for(int i=0; i<26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				maxIdx = i;
				isDuplicated = false;
			} else if(arr[i] == max) isDuplicated= true;
    	}
    	
    	if(isDuplicated) {
    		System.out.print("?");
    		return;
    	}
    	System.out.print((char) (maxIdx+'A'));
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);	
        String s = kb.next();
        T.solution(s.toUpperCase());
        kb.close();
    }
}