import java.util.Scanner;

public class baekjoon11653 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while (N != 1) {
			for (int i = 2; i < N; i++) {
				if (N % i == 0) {
					N /= i;
					System.out.println(i);
					break;
				}
			}
		}

	}

}
