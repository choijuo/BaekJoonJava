package lv1;

import java.util.*;
public class Lv1_kthNum {
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0;i<commands.length;i++){
            int[] inArr=commands[i];
            int[] splitArr=Arrays.copyOfRange(array,inArr[0]-1,inArr[1]);
            Arrays.sort(splitArr);
            answer[i]=splitArr[inArr[2]-1];
            
        }
        
        return answer;
    }
}
