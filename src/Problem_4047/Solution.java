package Problem_4047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[][] cards = new int[4][13]; // S, D, H, C
		StringBuilder sb = new StringBuilder();
		String str, substr;
		int idx_i = 0, idx_j = 0;
		int cnt;
		boolean flag;
		for (int t = 1; t <= T; t++) {
			flag = true;
			sb.append("#").append(t).append(" ");
			str = br.readLine();
			for(int i = 0; i < 4; i++)
				Arrays.fill(cards[i], 0);
			for (int i = 0; i < str.length(); i = i + 3) {
				substr = str.substring(i, i + 3);
				switch (substr.charAt(0)) {
				case 'S':
					idx_i = 0;
					break;

				case 'D':
					idx_i = 1;
					break;
				case 'H':
					idx_i = 2;
					break;
				case 'C':
					idx_i = 3;
					break;
				}

				idx_j = Integer.valueOf(substr.substring(1));
				if (cards[idx_i][idx_j - 1] == 0) {
					cards[idx_i][idx_j - 1] = 1;
				} else {
					sb.append("ERROR").append("\n");
					flag = false;
				}
			}
			if (flag) {
				for (int i = 0; i < 4; i++) {
					cnt = 0;
					for (int j = 0; j < 13; j++) {
						if (cards[i][j] == 0)
							cnt++;
					}
					sb.append(cnt).append(" ");
				}
				sb.append("\n");

			}
		}
		System.out.print(sb.toString());
	}
}
