import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import javafx.print.Collation;
import sun.security.util.Length;

public class baekjoon1427 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String N = br.readLine();
		int size = N.length();
		char[] a = new char[size];

		for (int i = 0; i < a.length; i++) {
			a[i] = N.charAt(i);
		}
		Arrays.sort(a);
		
		for(int j=a.length-1;j>=0;j--) {
			System.out.print(a[j]);
		}
	}

}
