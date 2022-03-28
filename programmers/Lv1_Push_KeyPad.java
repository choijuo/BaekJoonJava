package lv1;

public class Lv1_Push_KeyPad {
	public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int left=10;//*
        int right=12;//#
        
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7){
                answer+="L";
                left=numbers[i];
            }else if(numbers[i]==3 || numbers[i]==6 ||numbers[i]==9){
                answer+="R";
                right=numbers[i];
            }else{
                if(numbers[i]==0){
                    numbers[i]=11;
                }
                int leftDistance=Math.abs(left-numbers[i])/3+Math.abs(left-numbers[i])%3;
                int rightDistance=Math.abs(right-numbers[i])/3+Math.abs(right-numbers[i])%3;
                
                if(leftDistance>rightDistance){
                    answer+="R";
                    right=numbers[i];
                }else if(leftDistance<rightDistance){
                    answer+="L";
                    left=numbers[i];
                }else if(leftDistance==rightDistance){
                    if(hand.equals("left")){
                        answer+="L";
                        left=numbers[i];
                    }else{
                        answer+="R";
                        right=numbers[i];
                    }
                }
            }
        }
        
        return answer;
    }
}
