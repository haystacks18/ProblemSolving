class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int rec1 = 0;
        int rec2 = 0;
        for (int[] size: sizes) {
            int size1 = (size[0] >= size[1]) ? size[0] : size[1];
            int size2 = (size[0] >= size[1]) ? size[1] : size[0];
            if (size1 > rec1 && size2 > rec2) {
                rec1 = size1;
                rec2 = size2;
            }
            else if (size1 > rec1) {
                rec1 = size1;
            }
            else if (size2 > rec2) {
                rec2 = size2;
            }
        }
        
        answer = rec1*rec2;
        return answer;
    }
}