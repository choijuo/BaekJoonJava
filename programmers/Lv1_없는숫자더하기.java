package lv1;

public class Lv1_없는숫자더하기 {
	public int solution(int[] numbers) {
        int answer = 0;        
        
        //0~9 합 : 45
        
        for(int i:numbers)
            answer+=i;
        
        answer=45-answer;
        
        
        return answer;
    }
}
