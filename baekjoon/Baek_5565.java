package baekjoon;
import java.util.Scanner;

public class Baek_5565 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int tot=scan.nextInt();
		int sum=0;
		for(int i=0;i<9;i++) {
			int price=scan.nextInt();
			sum+=price;
		}
		System.out.println(tot-sum);
	}

}
