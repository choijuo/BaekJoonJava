package lv1;
import java.util.*;
public class Lv1_크레인인형뽑기게임 {
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack=new Stack<>();
        
        for(int i=0;i<moves.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[j][moves[i]-1]!=0){//0이 아닌경우 : 뽑을 자리에 인형이 존재한다면
                    if(!stack.isEmpty() && board[j][moves[i]-1] == stack.peek()){//스택에 중복되는 경우
                        answer+=2;
                        stack.pop();//스택에서 삭제
                    }else{//스택에 중복안되는 경우 add
                        stack.add(board[j][moves[i]-1]);
                    }
                    board[j][moves[i]-1]=0;
                    break;
                }
            }
        }       
              
        return answer;
    }
}
