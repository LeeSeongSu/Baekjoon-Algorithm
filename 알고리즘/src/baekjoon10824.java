import java.util.Scanner;

public class baekjoon10824 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		long a;
		long b, c, d;

		a = sc.nextLong();
		b = sc.nextLong();
		c = sc.nextLong();
		d = sc.nextLong();
		long e = Long.parseLong((Long.toString(a) + Long.toString(b)))
				+ Long.parseLong((Long.toString(c) + Long.toString(d)));
		System.out.println(e);

	}
}