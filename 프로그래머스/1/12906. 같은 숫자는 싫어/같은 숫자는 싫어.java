import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList();
        int prev = 10;
        for (int i=0; i<arr.length; i++){
            int now = arr[i];
            if (prev != now){
                answer.add(now);
                prev = now;
            }        
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}