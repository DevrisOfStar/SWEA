package Problem_2817;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static boolean[] isSelected;
	public static int[] arr;
	public static int N, K, cnt;

	public static void dfs(int idx) {
		if (idx == N) {
			int sum = 0;
			for (int i = 0; i < N; i++) {
				if (isSelected[i])
					sum += arr[i];
			}
			if (sum == K)
				cnt++;
			return;
		} else {
			isSelected[idx] = true;
			dfs(idx+1);
			isSelected[idx] = false;
			dfs(idx+1);
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int t = 1; t <= T; t++) {
			st = new StringTokenizer(br.readLine().trim(), " ");
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			cnt = 0;
			arr = new int[N];
			isSelected = new boolean[N];
			st = new StringTokenizer(br.readLine().trim(), " ");

			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			dfs(0);
			
			System.out.printf("#%d %d\n", t, cnt);
		}
	}
}
