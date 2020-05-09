import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class baekjoon10825 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[][] arr = new String[N][4];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = sc.next();
			}
		}

		Arrays.sort(arr, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				if (Integer.parseInt(o1[1]) == Integer.parseInt(o2[1])) {
					if (Integer.parseInt(o1[2]) == Integer.parseInt(o2[2])) {
						if (Integer.parseInt(o1[3]) == Integer.parseInt(o2[3])) {
							return o1[0].compareTo(o2[0]);
						}
						return Integer.compare(Integer.parseInt(o2[3]), Integer.parseInt(o1[3]));
					}
					return Integer.compare(Integer.parseInt(o1[2]), Integer.parseInt(o2[2]));
				}
				return Integer.compare(Integer.parseInt(o2[1]), Integer.parseInt(o1[1]));
			}

		});
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i][0]);

		}
	}
}