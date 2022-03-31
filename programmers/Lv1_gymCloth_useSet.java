package lv1;
import java.util.*;
public class Lv1_gymCloth_useSet {
public int solution(int n, int[] lost, int[] reserve) {
        
        //1.Set을 만든다.
        HashSet<Integer> resSet=new HashSet<Integer>();
        HashSet<Integer> lostSet=new HashSet<Integer>();
        
        for(int i:reserve)
            resSet.add(i);
        
        for(int i:lost){//중복이 있기때문에 중복을 처리해줘야한다.
            if(resSet.contains(i))//여분이 있는 학생이 도둑을 맞았으면 빌려줄수없고 자기꺼만 가지고있는경우
                resSet.remove(i);
            else
                lostSet.add(i);
        }
        
        //2.여분을 기준으로 앞뒤로 확인하여 체육복을 빌려준다.
        for(int i:resSet){
            if(lostSet.contains(i-1))
                lostSet.remove(i-1);
            else if(lostSet.contains(i+1))
                lostSet.remove(i+1);
        }
        
    
        //3.전체 학생 수에서 lostSet에 남은 학생수를 빼준다.
        
        return n-lostSet.size();
    }
}
