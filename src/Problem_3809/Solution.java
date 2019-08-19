package Problem_3809;

import java.io.IOException;
import java.util.Scanner;

public class Solution {
	static int[] arr;

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String temp;
		for (int t = 1; t <= T; t++) {
			StringBuilder sb = new StringBuilder();
			int N = sc.nextInt();

			for (int i = 0; i < N; i++) {
					sb.append(sc.nextInt());
			}
			int cnt = -1;
			while (true) {
				cnt++;
				temp = String.valueOf(cnt);
				if (sb.toString().contains(temp))
					continue;
				else
					break;
			}
			System.out.printf("#%d %d\n", t, cnt);

		}
	}
}
