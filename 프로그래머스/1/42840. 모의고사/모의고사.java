import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {2,1,2,3,2,4,2,5};
        int[] a3 = {3,3,1,1,2,2,4,4,5,5};
        
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        
        for (int i=0; i<answers.length; i++) {
            if (a1[i%a1.length] == answers[i]) s1 += 1;
            if (a2[i%a2.length] == answers[i]) s2 += 1;
            if (a3[i%a3.length] == answers[i]) s3 += 1;
        }
        int rec = 0;
        int[] scores = {s1, s2, s3};
        for (int score: scores) rec = (rec<score)? score : rec;
        
        ArrayList<Integer> l1 = new ArrayList();
        for (int i=0; i<3; i++) {
            if (scores[i] == rec) l1.add(i+1);
        }
        
        int[] answer = new int[l1.size()];
        for (int i=0; i<l1.size(); i++) {
            answer[i] = l1.get(i);
        }
        return answer;
    }
}