import java.util.Scanner;

public class baekjoon11047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N, K;
		N = sc.nextInt();
		K = sc.nextInt();
		int[] M = new int[N];

		int count = 0;
		for (int i = N - 1; i >= 0; i--) {
			M[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			count += K / M[i];
			K %= M[i];
		}

		System.out.println(count);
	}

}
