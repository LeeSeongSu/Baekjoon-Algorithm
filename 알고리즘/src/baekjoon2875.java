
import java.util.Scanner;

public class baekjoon2875 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N, M, K;
		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();
		int team = 0;
		while (N >= 2 && M >= 1 && N + M >= 3 + K) {
			N -= 2;
			M--;
			team++;
		}

		System.out.println(team);
	}

}
