package Problem_3752;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	static boolean[] result = new boolean[10001];
	static int N;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] arr;
		int sum, cnt;
		StringTokenizer st;
		for (int t = 1; t <= T; t++) {
			N = Integer.parseInt(br.readLine());
			sum = 0;
			cnt = 0;
			arr = new int[N];
			st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				sum += arr[i];
			}
			
			result[0] = true;

			for (int i = 0; i < N; i++) {
				for (int j = sum; j >= 0; j--) {
					if (result[j])
						result[j + arr[i]] = true;
				}
			}
			for (int i = 0; i <= sum; i++)
				if (result[i])
					cnt++;
			System.out.printf("#%d %d\n",t, cnt);
			Arrays.fill(result, false);
		}
	}
}
