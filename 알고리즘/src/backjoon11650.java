import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class backjoon11650 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b[][] = new int[a][2];

		for (int i = 0; i < a; i++) {
			b[i][0] = sc.nextInt();
			b[i][1] = sc.nextInt();

		}
		Arrays.sort(b, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0])// x좌표의 값이 같다면 y좌표를 기준으로 정렬
					return Integer.compare(o1[1], o2[1]);
				return Integer.compare(o1[0], o2[0]); //
			}
		});
		for (int i = 0; i < b.length; i++) {

			System.out.println(b[i][0] + " " + b[i][1]);

		}
	}
}
