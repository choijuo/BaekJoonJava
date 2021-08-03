package baekjoon;
import java.util.Scanner;

public class Baek_2577 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int result=a*b*c;
		int count[]=new int[10];
		
		while(result>0) {
			count[result%10]++;
			result/=10;
		}
		for(int i=0;i<count.length;i++) {
			System.out.println(count[i]);
		}

	}

}
