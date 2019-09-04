package Problem_1215;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		char[][] chars = new char[8][8];
		for (int t = 1; t <= 10; t++) {
			int cnt = 0;
			int N = Integer.parseInt(br.readLine());
			for (int i = 0; i < 8; i++) {
				str = br.readLine();
				for (int j = 0; j < 8; j++) {
					chars[i][j] = str.charAt(j);
				}
			}

			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if (i + N <= 8) {
						boolean f = true;
						for (int a = i, b = i + N - 1; a < i + N / 2; a++, b--)
							if (chars[a][j] != chars[b][j])
								f = false;
						if (f)
							cnt++;

					}

					if (j + N <= 8) {
						boolean f = true;
						for (int a = j, b = j + N - 1; a < j + N / 2; a++, b--)
							if (chars[i][a] != chars[i][b])
								f = false;
						if (f)
							cnt++;

					}
				}
			}
			System.out.printf("#%d %d\n", t, cnt);
		}

	}
}
