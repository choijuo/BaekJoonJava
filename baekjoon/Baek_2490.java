package baekjoon;
import java.util.Scanner;

public class Baek_2490 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int arr[] = new int[4];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i] = scan.nextInt();
				if (arr[i] == 1) {
					count++;
				}
			}
			switch (count) {
			case 0:
				System.out.print("D\n");
				break;
			case 1:
				System.out.print("C\n");
				break;
			case 2:
				System.out.print("B\n");
				break;
			case 3:
				System.out.print("A\n");
				break;
			case 4:
				System.out.print("E\n");
				break;
			}count=0;
		}
	}
}
