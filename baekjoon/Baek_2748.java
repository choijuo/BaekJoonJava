package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek_2748 {
	static long[] memo=new long[91];
	static long Fibonacci(int num) {
		if(num==0) return 0;
		if(num==1) return 1;
		
		if(memo[num]!=0) {
			return memo[num];
		}
		
		return memo[num]=Fibonacci(num-1)+Fibonacci(num-2);
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N=Integer.parseInt(br.readLine());
		
		bw.write(String.valueOf(Fibonacci(N)));
		bw.flush();
		bw.close();
	}
}