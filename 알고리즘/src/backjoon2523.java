import java.util.Scanner;

public class backjoon2523 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a;

		a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print("*");

			}
			System.out.println();
		}
		for (int i = a-1; i > 0; i--){	// N+1 ~ 2N-1 За
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
