package baekjoon;
import java.util.Scanner;

public class Baek_10886 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int notcute=0,cute=0;
		for(int i=0;i<N;i++) {
			int val=scan.nextInt();
			if(val==0) {
				notcute++;
			}
			if(val==1) {
				cute++;
			}
		}
		if(notcute>cute) {
			System.out.println("Junhee is not cute!");
		}else
		{
			System.out.println("Junhee is cute!");
		}

	}

}
