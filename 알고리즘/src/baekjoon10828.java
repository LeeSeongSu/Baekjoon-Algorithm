import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class baekjoon10828 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();

		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < N; i++) {
			String val = sc.nextLine();
			String[] space = val.split(" ");

			switch (space[0]) {
			case "push":
				stack.push(Integer.parseInt(space[1]));
				break;

			case "pop":

				if (stack.isEmpty())
					System.out.println("-1");
				else

					System.out.println(stack.pop());

				break;
			case "size":
				System.out.println(stack.size());
				break;
			case "empty":
				if (stack.isEmpty())
					System.out.println("1");
				else
					System.out.println("0");
				break;
			case "top":
				if (stack.isEmpty())
					System.out.println("-1");

				else
					System.out.println(stack.peek());
				break;
			}
		}
	}

}
