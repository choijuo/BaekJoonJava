package baekjoon;

import java.util.Scanner;

public class Baek_5063 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		String[] str=new String[N+1];
		for(int i=0;i<N;i++) {
			int r=scan.nextInt();
			int e=scan.nextInt();
			int c=scan.nextInt();
			int result=e-c;
			if(result>r)str[i]="advertise";
			if(result==r)str[i]="does not matter";
			if(result<r)str[i]="do not advertise";
		}
		for(int i=0;i<N;i++) {
			System.out.println(str[i]);
		}
	String a="123";
	int sdf=Integer.parseInt(a);	}
}
