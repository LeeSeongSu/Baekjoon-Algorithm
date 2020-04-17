import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class baekjoon1931 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[][] array = new int[N][2];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());

		}
		Arrays.sort(array, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {

				if (o2[1] == o2[0]) {
					return o1[0] - o2[0];
				} else
					return o1[1] - o2[1];
			}
		});
		int count = 0; // �ִ밪 ����
		int end = -1; // �������� �ð��� ���� ����

		for (int i = 0; i < N; i++) {

			// ���� ���۽ð��� ���� ����ð����� ���� ���(1 4 �� 3 5 ó��)
			if (array[i][0] >= end) {

				end = array[i][1]; // ���� ����ð��� ���� ���۽ð��� ���ϱ����� ����
				count++;
			}
		}
		System.out.println(count);
	}

}
