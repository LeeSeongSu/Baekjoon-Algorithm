import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javafx.print.Collation;

public class baekjoon2751 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> array = new ArrayList<Integer>();

		int input = Integer.parseInt(br.readLine());

		for (int i = 0; i < input; i++) {
			array.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(array);
		for (int j = 0; j < array.size(); j++) {
			System.out.println(array.get(j));
		}

	}

}
