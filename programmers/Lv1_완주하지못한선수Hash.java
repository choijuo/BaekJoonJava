package lv1;

//import java.util.HashMap;
import java.util.*;
public class Lv1_�����������Ѽ���Hash {
	public String solution(String[] participant,String[] completion) {
		String answer="";
		HashMap<String, Integer> hm=new HashMap<>();
		
		for(String player:participant) {
			int cnt=hm.getOrDefault(player, 0);
			hm.put(player,++cnt);
			
		}
		System.out.println(hm.toString());
		
		for(String player:completion) {
			hm.put(player, hm.get(player)-1);
		}
		
		
		System.out.println(hm.toString());
		
		
		
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []participant= {"mislav","stanko","mislav","ana"};
		String []completion= {"stanko","ana","mislav"};
		
		Lv1_�����������Ѽ���Hash ph=new Lv1_�����������Ѽ���Hash();
		ph.solution(participant, completion);

	}

}
