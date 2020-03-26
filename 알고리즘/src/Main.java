import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a;

		a = sc.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(a + " * " + i + " = " + (a * i));
		}

	}
}