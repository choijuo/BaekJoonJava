package baekjoon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baek_5543 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		//Collection.min(list);
		int arr[]=new int[6];

		for(int i=0;i<5;i++) {
			arr[i]=scan.nextInt();
		}
		
		for(int i=0;i<3;i++) {
			list.add(arr[i]+arr[3]-50);
			list.add(arr[i]+arr[4]-50);
		}
		
		int result=Collections.min(list);
		System.out.println(result);
		
		
	}

}
