package Problem_6781;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		char[] color, number;
		int[] rgb = new int[3];
		int[][] RGBs = new int[3][10];
		int Answer = 0;

		for (int t = 1; t <= T; t++) {
			number = br.readLine().toCharArray();
			color = br.readLine().toCharArray();
			sb.append("#").append(t).append(" ");
			for (int i = 0; i < 9; i++) {
				switch (color[i]) {
				case 'R':
					rgb[0]++;
					RGBs[0][number[i] - '0']++;
					break;
				case 'G':
					rgb[1]++;
					RGBs[1][number[i] - '0']++;
					break;
				case 'B':
					rgb[2]++;
					RGBs[2][number[i] - '0']++;
					break;
				}
			}
			for(int i=0; i<3; i++) if(rgb[i] % 3 != 0) Answer-=100;
			
			for (int i = 0; i < 3; i++) {
				if (rgb[i] >= 3) {
					for (int j = 0; j < 10; j++) {
						if (RGBs[i][j] >= 3) {
							Answer++;
							RGBs[i][j] -= 3;
							j--;
						} else if (j < 8) {
							if (RGBs[i][j] >= 1 && RGBs[i][j + 1] >= 1 && RGBs[i][j + 2] >= 1) {
								RGBs[i][j]--;
								RGBs[i][j + 1]--;
								RGBs[i][j + 2]--;
								Answer++;
								j--; // 한번 더 검사
							}
						}
					}
				}
			}

			if (Answer == 3) {
				sb.append("Win");
			} else {
				sb.append("Continue");
			}
			sb.append("\n");
			// init data.
			for (int i = 0; i < 3; i++)
				Arrays.fill(RGBs[i], 0);
			Arrays.fill(rgb, 0);
			Answer = 0;
		}
		System.out.print(sb.toString());
	}
}
