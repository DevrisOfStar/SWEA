package Problem_8771;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		long answer;
		long N, A, B;
		for (int t = 1; t <= T; t++) {
			answer = 0;
			sb.append("#").append(t).append(" ");
			st = new StringTokenizer(br.readLine(), " ");

			N = Long.parseLong(st.nextToken());
			A = Long.parseLong(st.nextToken());
			B = Long.parseLong(st.nextToken());

			if (B > A && N > 1) {
				answer = (N - 1) * (B-A) + (A-B) + 1;
			} else if (A == B) {
				answer = 1;
			}

			sb.append(answer).append("\n");
		}

		System.out.print(sb.toString());
	}
}
