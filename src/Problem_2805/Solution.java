package Problem_2805;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			int N = Integer.parseInt(br.readLine().trim());
			int[][] arr = new int[N][N];

			for (int i = 0; i < N; i++) {
				String str = br.readLine().trim();
				for (int j = 0; j < N; j++) {
					arr[i][j] = str.charAt(j) -'0';
				}
			}
			int z = N / 2;
			int k = z;
			int sum = 0;
			for (int i = 0; i < N / 2; i++) {
				for (int j = 0; j < N; j++) {
					if (j < k || j >= N-k) continue;
					else sum += arr[i][j];
						
				}
				k--;
			}
			k = 0;
			for (int i = (N / 2); i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (j < k || j >= N-k) continue;
					else sum += arr[i][j];
						
				}
				k++;
			}

			System.out.printf("#%d %d\n", t, sum);
		}
	}
}
