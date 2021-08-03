package baekjoon;
import java.util.Scanner;

public class Baek_5585 {
	static int count=0;
	static int temp;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int input=scan.nextInt();
		int change=1000-input;
		ChangeCount(change);
	}
	public static void ChangeCount(int a) {
		if(a>=500) {
			temp=a%500;
			count+=a/500;
			a=temp;
		}
		if(a>=100) {
			temp=a%100;
			count+=a/100;
			a=temp;
		}
		if(a>=50) {
			temp=a%50;
			count+=a/50;
			a=temp;
		}
		if(a>=10) {
			temp=a%10;
			count+=a/10;
			a=temp;
		}
		if(a>=5) {
			temp=a%5;
			count+=a/5;
			a=temp;
		}
		if(a<5 && a>0) {
			temp=a%1;
			count+=a/1;
			a=temp;
		}
		System.out.println(count);
	}

}
