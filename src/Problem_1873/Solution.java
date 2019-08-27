package Problem_1873;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static char[][] map;
	static int t_x, t_y;
	static int dir;
	static int dx[] = { -1, 1, 0, 0 };
	static int dy[] = { 0, 0, -1, 1 };
	static char[] shape = { '^', 'v', '<', '>' };

	public static void exec(char c) {
		if (c == 'S') {
			// shoot.
			int s_x = t_x + dx[dir];
			int s_y = t_y + dy[dir];
			
			while(0 <= s_x && s_x < map.length && 0 <= s_y && s_y < map[0].length) {
				if(map[s_x][s_y] =='*') {
					map[s_x][s_y] = '.';
					break;
				}
				else if(map[s_x][s_y] =='#') {
					break;
				}
				s_x += dx[dir];
				s_y += dy[dir];
			}
		} else {
			if (c == 'U') dir = 0;
			else if (c == 'D') dir = 1;
			else if (c == 'L') dir = 2;
			else if (c == 'R') dir = 3;
			
			if (0 > t_x + dx[dir] || t_x + dx[dir] >= map.length || 0 > t_y + dy[dir]
					|| t_y + dy[dir] >= map[0].length) {
				map[t_x][t_y] = shape[dir];
			} else if (map[t_x + dx[dir]][t_y + dy[dir]] == '.') {
				map[t_x + dx[dir]][t_y + dy[dir]] = shape[dir];
				map[t_x][t_y] = '.';
				t_x += dx[dir];
				t_y += dy[dir];
			} else {
				map[t_x][t_y] = shape[dir];
			}
		}

	}
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int H, W;
		int T = Integer.parseInt(br.readLine().trim());
		StringTokenizer st;
		String str;
		StringBuilder sb = new StringBuilder();
		for (int t = 1; t <= T; t++) {
			sb.append("#").append(t).append(" ");
			st = new StringTokenizer(br.readLine(), " ");
			H = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());

			map = new char[H][W];

			for (int i = 0; i < H; i++) {
				str = br.readLine().trim();
				for (int j = 0; j < W; j++) {
					map[i][j] = str.charAt(j);
					if (map[i][j] == '^') {
						t_x = i;
						t_y = j;
						dir = 0;
					} else if (map[i][j] == 'v') {
						t_x = i;
						t_y = j;
						dir = 1;
					} else if (map[i][j] == '<') {
						t_x = i;
						t_y = j;
						dir = 2;
					}
					if (map[i][j] == '>') {
						t_x = i;
						t_y = j;
						dir = 3;
					}
				}
			}
			str = br.readLine();
			str = br.readLine();
			
			for (int i = 0; i < str.length(); i++) {
				// 명령어 별로 실행
				exec(str.charAt(i));
			}
			for(int i = 0 ; i < map.length; i++) {
				for(int j = 0; j <map[0].length; j++) {
					sb.append(map[i][j]);
				}
				sb.append("\n");
			}
		}
		System.out.print(sb.toString());
	}
}
