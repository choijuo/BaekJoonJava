package lv1;

//lv1 3진법 뒤집기
public class Lv1_ternary {
	public int solution(int n) {
        int answer = 0;
        String third="";    
        
        while(n>0){
            third+=(n%3);
            n/=3;
        }
            
        answer=Integer.parseInt(third,3);               
        
        return answer;
    }
}
