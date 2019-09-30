package Problem_7699;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	static int R, C;
	static char[][] map;
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static boolean[] alpha = new boolean[26]; // alpha
	static int max = Integer.MIN_VALUE;

	public static void func(int r, int c, int number) {
		if (max < number) max = number;
		
		for (int i = 0; i < 4; i++) {
			int x = r + dx[i];
			int y = c + dy[i];
			
			if (x < 0 || y < 0 || x >= R || y >= C)
				continue;
			int t = map[x][y] - 'A';
			if (!alpha[t]) {
				alpha[t] = true;
				func(x, y, number + 1);
				alpha[t] = false;
			}

		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String str;
		for (int t = 1; t <= T; t++) {
			str = br.readLine();
			Arrays.fill(alpha, false);
			max = Integer.MIN_VALUE;
			R = Integer.parseInt(str.split(" ")[0]);
			C = Integer.parseInt(str.split(" ")[1]);
			map = new char[R][C];
			for (int i = 0; i < R; i++) {
				str = br.readLine();
				for (int j = 0; j < C; j++) {
					map[i][j] = str.charAt(j);
				}
			}
			alpha[map[0][0] - 'A'] = true;
			func(0, 0, 1);

			System.out.printf("#%d %d\n", t, max);
		}
	}
}
