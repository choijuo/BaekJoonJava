package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Baek_1764 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int M=scan.nextInt();
		
		scan.nextLine();
		
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<N;i++) {
			String s=scan.nextLine();
			list.add(s);
		}
		Collections.sort(list);
		String[] arr=new String[list.size()];
		arr=list.toArray(arr);
		
		ArrayList<String> list2=new ArrayList<String>();
		for(int i=0;i<M;i++) {
			String s=scan.nextLine();
			int index=Arrays.binarySearch(arr, s);
			if(index>=0) {
				list2.add(s);
			}
		}
		Collections.sort(list2);
		System.out.println(list2.size());
		for(int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i));
		}
		
		
	}

}
