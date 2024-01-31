import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> hashMap1 = new HashMap<>(100001);
        
        for (String i: participant) {
            hashMap1.put(i, (Integer) hashMap1.getOrDefault(i, 0) + 1);
        }
        
        for (String i: completion) {
            hashMap1.put(i, (Integer) hashMap1.get(i) - 1);
            if (hashMap1.get(i) == 0) hashMap1.remove(i);
        }
        
        for (String i: hashMap1.keySet()) {
            answer = i;
        }
        
        return answer;
    }
}