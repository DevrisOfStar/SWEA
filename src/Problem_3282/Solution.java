package Problem_3282;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static int T;
	static StringTokenizer st;
	static int N, K;
	static int[][] arr = new int[101][2];
	static int[][] dp = new int[101][1001];
	static int max;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			max = 0;
			st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());

			for (int i = 1; i <= N; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				arr[i][0] = Integer.parseInt(st.nextToken());
				arr[i][1] = Integer.parseInt(st.nextToken());
			}
			bf();
			System.out.printf("#%d %d\n", t, max);
		}
	}

	public static void bf() {
		for (int i = 0; i <= K; i++) {
			dp[0][i] = 0;
		}

		for (int j = 1; j <= N; j++) {
			for (int i = 0; i <= K; i++) {
				if (i - arr[j][0] < 0)
					dp[j][i] = dp[j - 1][i];
				else {
					dp[j][i] = Math.max(dp[j - 1][i], dp[j - 1][i - arr[j][0]]+arr[j][1]);
				}
			}
		}

		max = dp[N][K];
	}


}
