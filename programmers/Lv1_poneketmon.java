package lv1;
import java.util.*;
public class Lv1_poneketmon {
	public int solution(int[] nums) {
        int answer = 0;
        int select=nums.length/2;
        
        HashSet<Integer> set=new HashSet<Integer>();
        
        for(int i:nums){
            set.add(i);
        }
        
        if(select<set.size()){
            answer=select;
        }else{
            answer=set.size();
        }
        
        return answer;
    }
}
