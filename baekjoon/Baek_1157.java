package baekjoon;

import java.util.Scanner;

public class Baek_1157 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine().toUpperCase();
		//�Է¹��� �ܾ��� ���ĺ��� �빮�� �������� ���Ǿ� ��µȴ�, 
		
		int cnt[] = new int[26];// A ~ Z ���� ������ ���ĺ� ������ ����� �迭
		int max = 0;
		char res = 0;

		for (int i = 0; i < word.length(); i++) {
			cnt[word.charAt(i) - 65]++;//�빮�� A�� �ƽ�Ű �ڵ�� 65 �̹Ƿ� 65�� ���ָ� 0���� ���������� �迭�̵�
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
