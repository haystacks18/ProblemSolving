import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i=0; i<commands.length; i++) { // i번째 테스트케이스에 대해
            int[] testcase = commands[i];
            int st = testcase[0], en = testcase[1], nth = testcase[2];
            int[] arr1 = Arrays.copyOfRange(array, st-1, en); // 끝 포함여부 주의
            
            // 슬라이싱한 arr1 정렬
            for (int j=0; j<arr1.length; j++) {
                for (int k=0; k<arr1.length-1; k++) {
                    if (arr1[k] > arr1[k+1]) {
                        int temp;
                        temp = arr1[k];
                        arr1[k] = arr1[k+1];
                        arr1[k+1] = temp;
                    }
                }
            }
            
            System.out.println(Arrays.toString(arr1));
            answer[i] = arr1[nth-1];
        }
        
        return answer;
    }
}