import java.util.Scanner;
import java.util.Stack;

public class baekjoon10773 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();

		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < K; i++) {
			int val = sc.nextInt();

			if (val == 0)
				stack.pop();
			else
				stack.push(val);
		}
		int sum = 0;
		for (int j : stack) {
			sum += j;
		}
		System.out.println(sum);
	}

}
