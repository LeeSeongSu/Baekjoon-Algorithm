import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class baekjoon11656 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String[] a = new String[S.length()];
		for (int i = 0; i < S.length(); i++) {

			a[i] = S.substring(i);

		}
		Arrays.sort(a);
		for (int j = 0; j < S.length(); j++) {
			System.out.println(a[j]);
		}

	}

}