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
		int count = 0; // 최대값 변수
		int end = -1; // 다음시작 시간과 비교할 변수

		for (int i = 0; i < N; i++) {

			// 현재 시작시간이 이전 종료시간보다 늦을 경우(1 4 와 3 5 처럼)
			if (array[i][0] >= end) {

				end = array[i][1]; // 현재 종료시간을 다음 시작시간과 비교하기위해 저장
				count++;
			}
		}
		System.out.println(count);
	}

}
