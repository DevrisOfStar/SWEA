package Problem_1216;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[][] chars = new char[100][100];
		int max = 0;
		String str;
		for (int t = 1; t <= 10; t++) {
			sb.append("#").append(t).append(" ");
			br.readLine(); // t <<

			// input data
			for (int i = 0; i < 100; i++) {
				str = br.readLine();
				for (int j = 0; j < 100; j++) {
					chars[i][j] = str.charAt(j);
				}
			}
			for (int len = 100; len >= 1; len--) {
				for (int s = 0; s < 100 - len + 1; s++) {
					boolean flag;
					for (int i = 0; i < 100; i++) {
						flag = true;
						for (int j = 0; j < len / 2; j++) {
							if (chars[i][s + j] != chars[i][s + len - 1 - j]) {
								flag = false;
								continue;
							}
						}
						if (flag && max < len) {

							max = len;
						}

						flag = true;
						for (int j = 0; j < len / 2; j++) {
							if (chars[s + j][i] != chars[s + len - 1 - j][i]) {
								flag = false;
							}
						}
						if (flag && max < len) {
							max = len;
						}
					}
				}
			}

			sb.append(max);
			sb.append("\n");
			max = 0;
		}
		System.out.print(sb.toString());
	}
}
