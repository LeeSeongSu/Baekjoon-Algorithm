import java.util.Scanner;

public class baekjoon11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int N = sc.nextInt();
		String M = sc.next();

		for (int i = 0; i < N; i++) {
			sum += M.charAt(i) - '0';

		}
		System.out.println(sum);
	}

}
