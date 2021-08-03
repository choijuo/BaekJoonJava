package baekjoon;

import java.util.Scanner;

public class Baek_2908 {
	static int reverse(int a) {
		int b=(a%10)*100+(a%100)/10*10+(a/100);
		
		return b;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		int res1=reverse(a);
		int res2=reverse(b);
		System.out.println((res1>res2)?res1:res2);

	}

}
