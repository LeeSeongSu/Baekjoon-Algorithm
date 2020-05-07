import java.util.Scanner;

//import java.util.Scanner;
//
//public class baekjoon10844 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//
//		int dp[] = new int[N + 1];
//		dp[1] = 9;
//		for (int i = 2; i <= N; i++) {
//			dp[i] = (dp[i - 1] * 2 - (i - 1)) % 1000000000;
//		}
//		System.out.println(dp[N]);
//	}
//
//}
//1 2 3 4 5 6 7 8 9  - 1줄 9개
//
//10 12 23 34 45 56  67 78 89  21 32 43 54 65 76 87 98 -  2줄 17개
//
//101 121 123   
//210 212 234 232
//345 321 323 343
//456 432 434 454
//567 543 545 565
//678 654 656 676 
//789 765 767 787 
//898 876 878
//987 989 
//
//3줄 - 32개
//
//    
// n 줄 = (n-1)*2-(n-1)
public class baekjoon10844 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] dp = new int[n + 1][10];
		for (int i = 1; i <= 9; i++) {
			dp[1][i] = 1;
		}
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j <= 9; j++) {
				if (j - 1 >= 0) {
					dp[i][j] += dp[i - 1][j - 1];
				}
				if (j + 1 <= 9) {
					dp[i][j] += dp[i - 1][j + 1];
				}
				dp[i][j] %= 1000000000;
			}
		}
		long ans = 0;
		for (int i = 0; i <= 9; i++) {
			ans += dp[n][i];
		}
		ans %= 1000000000;
		System.out.println(ans);
	}
}
