package lv1;
import java.util.*;
public class Lv1_gymCloth_useSet {
public int solution(int n, int[] lost, int[] reserve) {
        
        //1.Set�� �����.
        HashSet<Integer> resSet=new HashSet<Integer>();
        HashSet<Integer> lostSet=new HashSet<Integer>();
        
        for(int i:reserve)
            resSet.add(i);
        
        for(int i:lost){//�ߺ��� �ֱ⶧���� �ߺ��� ó��������Ѵ�.
            if(resSet.contains(i))//������ �ִ� �л��� ������ �¾����� �����ټ����� �ڱⲨ�� �������ִ°��
                resSet.remove(i);
            else
                lostSet.add(i);
        }
        
        //2.������ �������� �յڷ� Ȯ���Ͽ� ü������ �����ش�.
        for(int i:resSet){
            if(lostSet.contains(i-1))
                lostSet.remove(i-1);
            else if(lostSet.contains(i+1))
                lostSet.remove(i+1);
        }
        
    
        //3.��ü �л� ������ lostSet�� ���� �л����� ���ش�.
        
        return n-lostSet.size();
    }
}
