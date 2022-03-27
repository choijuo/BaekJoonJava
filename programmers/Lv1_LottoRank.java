package lv1;

import java.util.*;
public class Lv1_LottoRank {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};
        int zeroCnt=0;
        int same=0;
        Arrays.sort(lottos);//오름차순
        Arrays.sort(win_nums);

        //0 0 1 25 31 44
        //1 6 10 19 31 45
        
        // 1 1 , 2 2
        
        for(int i=0;i<lottos.length;i++){
            if(lottos[i]==0){
                zeroCnt++;
            }
        }

        for(int i=0;i<win_nums.length;i++){
            for(int j=zeroCnt;j<win_nums.length;j++){
                if(lottos[j]==win_nums[i]){
                    same++;
                    
                }
                
            }
        }
        
        int min=same;//2개일치
        int max=same+zeroCnt;//4개일치(0의개수가 둘다 맞는다고 가정할때 가장많은 일치 ex)4
        System.out.println(min+"/"+max);
        
        /*
        7-min =5 7 1
        7-max =3 1 1
        */
        
        answer[0]=Math.min(7-max,6);
        answer[1]=Math.min(7-min,6);
        
        return answer;
    }
}
