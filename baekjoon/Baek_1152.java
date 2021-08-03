package baekjoon;

import java.util.Scanner;

public class Baek_1152 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		
		String []word=input.trim().split(" ");
		
		if(word[0].equals("")) {
			System.out.println(0);
		}else {
			System.out.println(word.length);
		}
	}

}
