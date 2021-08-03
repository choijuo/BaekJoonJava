package baekjoon;
import java.util.Scanner;

public class Baek_2884 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int H=scan.nextInt();
		int M=scan.nextInt();
		
		int resultH=H;
		int resultM=M-45;
		if(resultM<0) {
			resultM+=60;
			resultH--;
			if(resultH<0) {
				resultH+=24;
			}
		}
		System.out.println(resultH+" "+resultM);
	}

}
