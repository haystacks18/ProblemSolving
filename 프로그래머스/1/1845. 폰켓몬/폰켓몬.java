import java.util.*;

class Solution {
    public int solution(int[] nums) {
        var h1 = new HashSet<>();
        for (Integer i: nums) {
            h1.add(i);
        }
        
        int answer = (h1.size() <= nums.length/2) ? h1.size() : nums.length/2;
        return answer;
    }
}