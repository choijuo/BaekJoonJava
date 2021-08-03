package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baek_1789 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		long S=Long.parseLong(st.nextToken());
		int a=1,sum=1;
		while(sum<S) {
			a++;
			sum+=a;
		}
		if(sum>S) {
			a--;
		}
		System.out.println(a);
	}

}
