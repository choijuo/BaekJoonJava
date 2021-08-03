package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek_5622 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] seq= {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
		
		StringBuilder sb=new StringBuilder(br.readLine());		
		String input=sb.toString();
		
		int sum=0;
		
		for(int i=0;i<input.length();i++) {
			sum+=seq[input.charAt(i)-65]+1;
			System.out.println(seq[input.charAt(i)-65]);
		}
		bw.write(sum+"\n");
		bw.flush();
		bw.close();

	}

}
// 868242
// 2 : ABC , 3 : DEF , 4 : GHI , 5 : JKL , 6 : MNO , 7 : PQRS , 8 : TUV , 9 : WXYZ 
// 1 :2s
// 9 7 9 3 5 3  
// 문자별 나온 값 모두 sum