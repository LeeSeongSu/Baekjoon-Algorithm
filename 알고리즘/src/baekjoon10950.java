import java.util.Scanner;

public class baekjoon10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		int[] N = new int[T];
		for (int i = 0; i < N.length; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			N[i] = a + b;
		}
		for (int j : N) {
			System.out.println(j);
		}
	}

}
