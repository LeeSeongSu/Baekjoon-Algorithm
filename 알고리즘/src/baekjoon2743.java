import java.util.Scanner;

public class baekjoon2743 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			count++;
		}
		System.out.println(count);
	}

}
