import java.util.ArrayList;
import java.util.Scanner;

public class backjoon5585 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int pay, count = 0;
		pay = sc.nextInt();
		int get = 1000 - pay;

		count += get / 500;
		get %= 500;
		count += get / 100;
		get %= 100;
		count += get / 50;
		get %= 50;
		count += get / 10;
		get %= 10;
		count += get / 5;
		get %= 5;
		count += get;

		System.out.println(count);
	}

}
