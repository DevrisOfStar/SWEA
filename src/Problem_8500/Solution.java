package Problem_8500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int N, cnt, a, max = Integer.MIN_VALUE;
		StringTokenizer st;
		for (int t = 1; t <= T; t++) {
			N = Integer.parseInt(br.readLine());
			cnt = 0;
			st = new StringTokenizer(br.readLine(), " ");

			for (int i = 0; i < N; i++) {
				a = Integer.parseInt(st.nextToken());
				cnt += a;

				if (max < a)
					max = a;

			}
			cnt += max;
			cnt += N;
			System.out.printf("#%d %d\n", t, cnt);
		}
	}
}
