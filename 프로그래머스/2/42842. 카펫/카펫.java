class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for (int i=1; i<Math.sqrt(yellow)+1; i++) {
            if (yellow % i == 0) {
                int j = yellow / i;
                if (((i+1) + (j+1))*2 == brown) {
                    answer[0] = j+2; // j is bigger than i, i<=sqrt(X)<=j
                    answer[1] = i+2;
                    break;
                }
            }
        }

        
        return answer;
    }
}