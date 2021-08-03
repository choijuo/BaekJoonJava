package baekjoon;
import java.util.Scanner;

public class IntegerTriangle {
	/*public static void bfs(int a,int b) {
		int a,b;
		
	}
*/
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[][] arr=new int[n+1][n+1];
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
	}

}
