import java.util.*;

class Solution {
    
    public int solution(String[][] clothes) {
        var h1 = new HashMap<String, Integer>();
        for (var i: clothes) {
            var j = i[1];
            h1.put(j, h1.getOrDefault(j, (Integer) 0) + 1);
        }
        
        int temp = 1;
        for (var item: h1.entrySet()) {
            int value = item.getValue();
            System.out.println(item.getValue());
            temp *= item.getValue()+1;
        }
        var answer = temp-1;
        return answer;
        
    }
}