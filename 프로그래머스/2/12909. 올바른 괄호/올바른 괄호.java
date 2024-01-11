import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stk1 = new Stack<>();
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == '('){stk1.push('(');
            } else{
                if (stk1.empty()){
                    answer = false;
                    break;
                } else{
                    stk1.pop();
                }
            }
        }
        if (!stk1.empty()) {answer = false;}
        return answer;
    }
}