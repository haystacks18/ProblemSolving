class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int[] visit = new int[priorities.length];
        
        int i=0;        
        int now_max = 0;
        for (int j=0; j<priorities.length; j++){
            if (visit[j] == 0 && priorities[j] > now_max){
                now_max = priorities[j];
            }
        }
        while (true){            
            if (visit[i] == 0 && priorities[i] == now_max){
                visit[i] = 1;
                answer++;
                if (i == location){break;}
                now_max = 0; // 최대값 재측정
                for (int j=0; j<priorities.length; j++){
                    if (visit[j] == 0 && priorities[j] > now_max){
                        now_max = priorities[j];
                    }
                }
            }
            i++;
            if (i == priorities.length){i=0;}
        }
        return answer;
    }
}