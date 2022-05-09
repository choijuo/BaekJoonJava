package lv1;
import java.util.*;
public class Lv1_choiceTwo_sum {
	public int[] solution(int[] numbers) {

        HashSet<Integer> set=new HashSet<>();        
        
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                int sum=numbers[i]+numbers[j];
                set.add(sum);
            }
        }

        int[] answer=new int[set.size()];
        Iterator<Integer> it=set.iterator();
        int idx=0;
        
        while(it.hasNext()){
            answer[idx]=it.next();
            idx++;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
