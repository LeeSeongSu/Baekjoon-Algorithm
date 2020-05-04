import java.util.Scanner;

public class baekjoon10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		System.out.println(factorial(N));
	}

	public static int factorial(int N) {

		if (N == 0) {
			return 1;

		} else {
			return N * (factorial(N-1));
		}

	}

}
