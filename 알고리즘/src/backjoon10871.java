import java.util.Scanner;

public class backjoon10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a, b;

		a = sc.nextInt();
		b = sc.nextInt();

		int[] c = new int[a];

		for (int i = 0; i < c.length; i++) {
			c[i] = sc.nextInt();
		}
		for (int i = 0; i < c.length; i++) {
			if (c[i] < b) {
				System.out.print(c[i] + " ");
			}
		}

	}

}
