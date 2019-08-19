package Problem_7466;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		String temp;
		int answer;
		for (int t = 1; t <= T; t++) {
			temp = br.readLine();
			int N = Integer.parseInt(temp.split(" ")[0]);
			int K = Integer.parseInt(temp.split(" ")[1]);
			answer = 1;

			do {
				if (K == 1 || N == 1)
					break;
				if (K % N == 0) {
					answer *= N;
					K /= N;
				}
				if (N > K) {
					N = K;
					continue;
				}
				N--;
			} while (true);

			System.out.printf("#%d %d\n", t, answer);
		}
	}
}
