import java.util.Scanner;

public class baekjoon11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();

		for (int i = 0; i < N.length(); i++) {
			System.out.print(N.charAt(i));
			if (i % 10 == 9)
				System.out.println();
		}

	}

}
