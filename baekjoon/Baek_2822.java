package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baek_2822 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[8];
		int arr_score[]=new int[5];
		int arr_idx[]=new int[5];
		for(int i=0;i<8;i++) {
			arr[i]=scan.nextInt();
		}
		
		for(int x=4;x>=0;x--) {
			int max=0;
			int idx=0;
			for(int y=0;y<8;y++) {
				if(max<arr[y]) {
					max=arr[y];
					idx=y;
				}
			}
			arr[idx]=0;
			arr_score[x]=max;
			arr_idx[x]=idx+1;
		}
		
		Arrays.sort(arr);
		int sum=0;
		for(int i=0;i<5;i++) {
			sum+=arr_score[i];
		}
		System.out.println(sum);
		
		Arrays.sort(arr_idx);
		for(int i=0;i<5;i++) {
			System.out.print(arr_idx[i]+" ");
		}

	}
	

}
