package Problem_2007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		int i = 0;
		String str, st, st2;
		for (int t = 1; t <= T; t++) {
			str = br.readLine().trim();
			for (i = 1; i <= 10; i++) {
				st = str.substring(0, i);
				st2 = str.substring(i, i * 2);

				if (st.equals(st2)) break;

			}

			System.out.printf("#%d %d\n", t, i);
		}
	}
}
