class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int i = 0; i<=9; i++) {
            answer += i;              
        }
        for (int i=0; i<numbers.length; i++) {
            answer -= numbers[i];
        }
        return answer;
    }
}
