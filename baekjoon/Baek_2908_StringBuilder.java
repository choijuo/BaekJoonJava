package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2908_StringBuilder {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder(br.readLine()).reverse();
		int input1=Integer.parseInt(sb.substring(0,3));
		int input2=Integer.parseInt(sb.substring(4,7));
		
		System.out.println(input1>input2?input1:input2);

	}

}
