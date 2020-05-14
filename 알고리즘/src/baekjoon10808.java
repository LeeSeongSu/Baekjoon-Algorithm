import java.util.Scanner;

public class baekjoon10808 {

	public static void main(String[] args) {

		int cnt[] = new int[26];
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i); //

			cnt[ch - 'a']++;
			
		}

		for (int i = 0; i < 26; i++) {

			System.out.print(cnt[i] + " ");

		}

	}

}
