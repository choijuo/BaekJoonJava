package lv1;

public class Lv1_���¼��ڴ��ϱ� {
	public int solution(int[] numbers) {
        int answer = 0;        
        
        //0~9 �� : 45
        
        for(int i:numbers)
            answer+=i;
        
        answer=45-answer;
        
        
        return answer;
    }
}
