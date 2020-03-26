import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a, sum = 0;

		a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			sum += i;

		}
		System.out.println(sum);
	}
}