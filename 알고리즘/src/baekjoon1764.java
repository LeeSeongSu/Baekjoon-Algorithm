import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class baekjoon1764 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer sc = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(sc.nextToken());
		int M = Integer.parseInt(sc.nextToken());

		HashSet<String> D = new HashSet<String>();
		ArrayList<String> B = new ArrayList<String>();
		for (int i = 0; i < N; i++) {
			D.add(br.readLine());
		}
		for (int i = 0; i < M; i++) {
			String b = br.readLine();
			if (D.contains(b)) {
				B.add(b);
			}
		}

		Collections.sort(B);

		System.out.println(B.size());
		for (String j : B) {
			System.out.println(j);
		}
	}
}
