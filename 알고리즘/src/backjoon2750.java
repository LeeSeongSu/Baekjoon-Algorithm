import java.util.*;

public class backjoon2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			list.add(num);
		}
		Collections.sort(list);
		for (int i :list)
			System.out.println(i);
	}
}
