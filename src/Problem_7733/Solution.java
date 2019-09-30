package Problem_7733;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	static int n;
	static int[][] arr;
	static boolean[][] ate;
	static int max = 0;
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int t = 1; t <= T; t++) {
			n = Integer.parseInt(br.readLine());
			arr = new int[n][n];
			ate = new boolean[n][n];
			max = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			bfs();
			System.out.printf("#%d %d\n", t, max);
		} // end test case;
	}

	public static void bfs() {
		Queue<int[]> q = new LinkedList<>();
		int cnt = 0;
		for (int k = 0; k <= 100; k++) {
			cnt = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (!ate[i][j] && arr[i][j] > k) {
						q.offer(new int[] { i, j });
						ate[i][j] = true;
						cnt++;

						while (!q.isEmpty()) {
							int[] data = q.poll();
							
							for (int v = 0; v < 4; v++) {
								int dx_ = data[0] + dx[v];
								int dy_ = data[1] + dy[v];
								if (dx_ < 0 || dy_ < 0 || dx_ >= n || dy_ >= n) continue;
								if (!ate[dx_][dy_] && arr[dx_][dy_] > k) {
									q.offer(new int[] { dx_, dy_ });
									ate[dx_][dy_] = true;
								}
							}
						}
					}
				}
			}
			if (max < cnt)
				max = cnt;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					ate[i][j] = false;
				}
			}
		}

	}
}
