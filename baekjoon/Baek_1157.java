package baekjoon;

import java.util.Scanner;

public class Baek_1157 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine().toUpperCase();
		//입력받은 단어의 알파벳은 대문자 기준으로 계산되어 출력된다, 
		
		int cnt[] = new int[26];// A ~ Z 까지 각각의 알파벳 사용수가 저장될 배열
		int max = 0;
		char res = 0;

		for (int i = 0; i < word.length(); i++) {
			cnt[word.charAt(i) - 65]++;//대문자 A의 아스키 코드는 65 이므로 65를 빼주면 0부터 순차적으로 배열이됨
			//ex) A : cnt[0] , B : cnt[1]

			if (max < cnt[word.charAt(i) - 65]) {
				max = cnt[word.charAt(i) - 65];
				res = word.charAt(i);
			} else if (max == cnt[word.charAt(i) - 65]) {
				res = '?';
			}
		}
		System.out.println(res);

	}

}
