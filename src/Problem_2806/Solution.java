package Problem_2806;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static int cnt;
	public static int[] map;

	public static void nqueen(int num) {
		if (num == map.length - 1) {
			cnt++;
			return;
		} else {
			for (int i = 1; i <= map.length - 1; i++) {
				map[num + 1] = i;
				if (ispossible(num + 1)) {
					nqueen(num + 1);
				} else {
					map[num + 1] = 0;
				}
			}
		}
		map[num] = 0;
	}

	public static boolean ispossible(int num) {
		for (int i = 1; i < num; i++) {
			if (map[i] == map[num])
				return false;
			if (Math.abs(map[i] - map[num]) == Math.abs(i - num))
				return false;
		}
		return true;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			int N = Integer.parseInt(br.readLine());
			cnt = 0;
			map = new int[N + 1];
			for (int i = 1; i <= N; i++) {
				map[1] = i;
				nqueen(1);
				map[1] = 0;
			}
			System.out.printf("#%d %d\n", t, cnt);
		}
	}
}
