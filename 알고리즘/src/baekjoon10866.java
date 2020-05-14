import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Spliterator;

public class baekjoon10866 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Deque<String> deq = new LinkedList<String>();
		int N = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < N; i++) {
			String M = sc.nextLine();
			String[] space = M.split(" ");

			switch (space[0]) {
			case "push_front":
				deq.addFirst(space[1]);
				break;
			case "push_back":

				deq.addLast(space[1]);
				break;
			case "pop_front":
				if (deq.isEmpty())
					System.out.println("-1");
				else
					System.out.println(deq.pollFirst());
				break;
			case "pop_back":
				if (deq.isEmpty())
					System.out.println("-1");
				else
					System.out.println(deq.pollLast());
				break;
			case "size":
				System.out.println(deq.size());
				break;
			case "empty":
				if (deq.isEmpty())
					System.out.println("1");
				else
					System.out.println("0");
				break;
			case "front":
				if (deq.isEmpty())
					System.out.println("-1");
				else
					System.out.println(deq.peekFirst());
				break;
			case "back":
				if (deq.isEmpty())
					System.out.println("-1");
				else
					System.out.println(deq.peekLast());
				break;
			}
		}
	}
}