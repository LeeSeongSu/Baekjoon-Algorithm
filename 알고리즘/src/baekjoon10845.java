import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon10845 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Deque<String> que = new LinkedList<String>();
		int N = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < N; i++) {
			String M = sc.nextLine();
			String[] num = M.split(" ");

			switch (num[0]) {
			case "push":
				que.offer(num[1]);
				break;
			case "pop":

				if (que.isEmpty())
					System.out.println("-1");
				else

					System.out.println(que.poll());
				break;
			case "size":
				System.out.println(que.size());
				break;
			case "empty":
				if (que.isEmpty())
					System.out.println("1");
				else
					System.out.println("0");
				break;
			case "front":
				if (que.isEmpty())
					System.out.println("-1");
				else
					System.out.println(que.peek());

				break;
			case "back":
				if (que.isEmpty())
					System.out.println("-1");
				else
					System.out.println(que.peekLast());
				break;

			}
		}
	}

}
