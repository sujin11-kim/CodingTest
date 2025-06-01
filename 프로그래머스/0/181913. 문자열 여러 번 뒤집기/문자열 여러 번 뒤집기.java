class Solution {
    public String solution(String my_string, int[][] queries) {
        for(int[] query: queries) {
            int s = query[0];
            int e = query[1];
            StringBuilder tmp = new StringBuilder(my_string.substring(s, e+1)).reverse();
            my_string = my_string.substring(0, s) + tmp.toString() + my_string.substring(e+1, my_string.length());
        }
        return my_string;
    }
}