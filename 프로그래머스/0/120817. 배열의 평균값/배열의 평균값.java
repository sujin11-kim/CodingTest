class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        for(int x: numbers) sum += x;
        answer = (double) sum / (double) numbers.length;
        return answer;
    }
}