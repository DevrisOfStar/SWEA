package Problem_1247;

import java.util.Scanner;

public class Solution {
	static int[][] arr = new int[10][2];
	static int[] home = new int[2];
	static int[] comp = new int[2];
	static int[] isVisited = new int[10];
	static boolean[] isvisited = new boolean[10];
	static int N;
	static int shortest;

	public static void dfs(int num, int x_, int y_, int sum) {
		if (num == N) {
			int sum_t = sum;
			sum_t += (Math.abs(x_ - comp[0]) + Math.abs(y_ - comp[1]));
			if (shortest > sum_t)
				shortest = sum_t;
			return;
		} else {
			for (int i = 0; i < N; i++) {
				if (!isvisited[i]) {
					isvisited[i] = true;
					isVisited[i] = i + 1;

					int sum_t = sum + Math.abs(x_ - arr[i][0]) + Math.abs(y_ - arr[i][1]);

					dfs(num + 1, arr[i][0], arr[i][1], sum_t);
					isVisited[i] = 0;
					isvisited[i] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			N = sc.nextInt();
			home[0] = sc.nextInt();
			home[1] = sc.nextInt();
			comp[0] = sc.nextInt();
			comp[1] = sc.nextInt();
			for (int i = 0; i < N; i++) {
				arr[i][0] = sc.nextInt();
				arr[i][1] = sc.nextInt();
			}
			shortest = Integer.MAX_VALUE;
			dfs(0, home[0], home[1], 0);
			System.out.printf("#%d %d\n", t, shortest);
		}

	}
}
