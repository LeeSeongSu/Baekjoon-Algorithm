import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class baekjoon10814 {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[][] arr = new String[N][2];
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = sc.next();
			arr[i][1] = sc.next();
		}
		Arrays.sort(arr, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {

				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}

		});
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j][0] + " " + arr[j][1]);
		}
	}

}
