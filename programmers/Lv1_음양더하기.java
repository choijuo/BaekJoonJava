package lv1;

public class Lv1_음양더하기 {
	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i=0;i<signs.length;i++){
            if(signs[i]==false){
                absolutes[i]= absolutes[i]-(2*absolutes[i]);
            }
            answer+=absolutes[i];
        }
                
        return answer;
    }
}
