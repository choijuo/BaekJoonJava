package baekjoon;
import java.util.Scanner;

public class Baek_2960 {
	static int N,K;
	static int eratos(int N,int K) {
		int cnt=0;
		int arr[]=new int[N+1];
		
		for(int i=0;i<=N;i++) {
			arr[i]=1;
		}
		
		for(int i=2;i<=N;i++) {
			for(int j=i;j<=N;j+=i) {
				if(arr[j]==1) {
					cnt++;
					arr[j]=0;
				}
				if(cnt==K) {
					return j;
				}
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		N=scan.nextInt();
		K=scan.nextInt();

		System.out.println(eratos(N, K));

	}

}
