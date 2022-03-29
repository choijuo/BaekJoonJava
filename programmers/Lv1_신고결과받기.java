package lv1;
import java.util.*;
public class Lv1_신고결과받기 {
	public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String,Integer> userMap=new HashMap<>();
        Map<String,HashSet<String>> reportMap=new HashMap<>();
        
        for(int i=0;i<id_list.length;i++){
            userMap.put(id_list[i],i);
            reportMap.put(id_list[i],new HashSet<>());
        }
        
        for(String str:report){
            String[] name=str.split(" ");
            String frId=name[0];
            String toId=name[1];
            reportMap.get(toId).add(frId);
        }
        
        for(int i=0;i<id_list.length;i++){
            HashSet<String> set=reportMap.get(id_list[i]);
            if(set.size()>=k){
                for(String name:set){
                    answer[userMap.get(name)]++;
                }
            }
        }
        
        
        return answer;
    }
}
