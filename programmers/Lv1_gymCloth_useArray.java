package lv1;

public class Lv1_gymCloth_useArray {
	public int solution(int n,int[] lost,int[] reserve) {
		int answer=0;
		int[] std=new int[n+2];
		
		
		for(int i:lost) {
			std[i]--;
		}
		
		for(int i:reserve) {
			std[i]++;
		}
		
		for(int i=1;i<=n;i++) {
			if(std[i]==1) {
				if(std[i-1]==-1) {
					std[i]--;
					std[i-1]++;
				}else if(std[i+1]==-1){
					std[i]--;
					std[i+1]++;
				}
			}
		}
		
		for(int i=1;i<=n;i++) {
			if(std[i]>=0)
				answer++;
		}
		
		return answer;
	}
}
