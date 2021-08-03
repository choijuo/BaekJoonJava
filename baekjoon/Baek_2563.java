package baekjoon;

import java.util.Scanner;

public class Baek_2563 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int arr[][]=new int[100][100];
		int area=0;
		
		for(int i=0;i<num;i++) {
			int x=scan.nextInt();
			int y=scan.nextInt();
			for(int height=y;height<y+10;height++) {
				for(int width=x;width<x+10;width++) {
					arr[height][width]=1;
				}
			}
		}
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(arr[i][j]==1) {
					area++;
				}
			}
		}System.out.println(area);

	}

}
