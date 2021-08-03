package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Baek_2750_2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<N;i++) {
			list.add(Integer.parseInt(br.readLine()));
		}

		/*for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}*/
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		Collections.sort(list);
		for(int i=0;i<N;i++) {
			bw.write(list.get(i)+"\n");			
		}
		bw.flush();
		bw.close();

	}

}

