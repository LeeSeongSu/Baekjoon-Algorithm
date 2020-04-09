import java.util.Scanner;

public class baekjoon1541 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String[] a = str.split("-");
		String[] temp1 = a[0].split("\\+");
		;// -이전 합치기

		int first = 0;
		for (String i : temp1) {
			first += Integer.parseInt(i);
		}

		int second = 0;
		for (int i = 1; i < a.length; i++) {
			String[] temp2 = a[i].split("\\+");// -이후 합치기
			for (String t : temp2)
				second += Integer.parseInt(t);

		}
		System.out.println(first - second);
	}
}
