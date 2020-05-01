import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon2002 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int count = 0;

		ArrayList<String> que1 = new ArrayList<String>();
		ArrayList<String> que2 = new ArrayList<String>();
		for (int i = 0; i < N; i++) {

			que1.add(br.readLine());
		}
		for (int i = 0; i < N; i++) {
			que2.add(br.readLine());
		}

		for (int i = 0; i < N;) {
			if (!que1.get(i).equals(que2.get(i))) {
				que1.remove(que2.get(i));
				que2.remove(i);
				count++;
				N--;
			} else
				i++;
		}
		System.out.println(count);
	}
}
