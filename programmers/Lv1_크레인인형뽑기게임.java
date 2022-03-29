package lv1;
import java.util.*;
public class Lv1_ũ���������̱���� {
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack=new Stack<>();
        
        for(int i=0;i<moves.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[j][moves[i]-1]!=0){//0�� �ƴѰ�� : ���� �ڸ��� ������ �����Ѵٸ�
                    if(!stack.isEmpty() && board[j][moves[i]-1] == stack.peek()){//���ÿ� �ߺ��Ǵ� ���
                        answer+=2;
                        stack.pop();//���ÿ��� ����
                    }else{//���ÿ� �ߺ��ȵǴ� ��� add
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
