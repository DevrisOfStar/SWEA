package Problem_1861;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };

	// 09:08 ~ 09:45
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		int[][] map = new int[1000][1000];
		boolean[][] visited = new boolean[1000][1000];
		int max_cnt;
		int cnt;
		int room_number;
		int max_rnumber;
		Queue<int[]> q = new LinkedList<>();
		StringTokenizer st;
		for (int t = 1; t <= T; t++) {
			int N = Integer.parseInt(br.readLine().trim());
			max_cnt = 0;
			room_number=0;
			max_rnumber=0;
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (visited[i][j]) {
						continue;
					}
					q.offer(new int[] { i, j, map[i][j] });
					visited[i][j] = true;
					cnt = 1;
					room_number = map[i][j];

					while (!q.isEmpty()) {
						int[] data = q.poll();
						for (int k = 0; k < 4; k++) {
							int dx_ = data[0] + dx[k];
							int dy_ = data[1] + dy[k];
							if (dx_ < 0 || dx_ >= N || dy_ < 0 || dy_ >= N)
								continue;
							if ((map[dx_][dy_] == (data[2] + 1) || map[dx_][dy_] == (data[2] - 1)) && !visited[dx_][dy_]) {
								q.offer(new int[] { dx_, dy_, map[dx_][dy_] });
								visited[dx_][dy_] = true;
								cnt++;
								if(room_number > map[dx_][dy_]) room_number = map[dx_][dy_];
							}
						}
					}
					if (max_cnt < cnt) {
						max_cnt = cnt;
						max_rnumber = room_number;
					}
					else if(max_cnt == cnt) {
						if(max_rnumber > room_number) max_rnumber = room_number;
					}
				}
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					visited[i][j] = false;
					map[i][j] = 0;
				}
			}

			System.out.printf("#%d %d %d\n", t, max_rnumber, max_cnt);

		}
	}
}
