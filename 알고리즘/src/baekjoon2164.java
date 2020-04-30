import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon2164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Queue<Integer> que = new LinkedList<Integer>();
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			que.offer(i);

		}
		while (que.size() != 1) {

			que.poll();
			int a = que.poll();
			que.offer(a);

		}
		System.out.println(que.peek());

	}

}
