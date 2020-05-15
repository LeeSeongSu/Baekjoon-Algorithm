import java.util.LinkedList;
import java.util.Scanner;

public class baekjoon1158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int temp = 0;

		LinkedList<Integer> arr = new LinkedList<Integer>();
		LinkedList<Integer> arr2 = new LinkedList<Integer>();

		for (int i = 1; i <= N; i++) {
			arr.add(i);
		}
		while (!arr.isEmpty()) {
			temp = (temp + K - 1) % arr.size();
			arr2.add(arr.remove(temp));

		}
		System.out.print("<");
		for (int j = 0; j < N; j++) {
			System.out.print(arr2.get(j));
			if (j != N - 1)
				System.out.print(", ");
		}
		System.out.print(">");
	}

}
