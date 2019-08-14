package Problem_5986;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	static boolean[] primes = new boolean[1000];

	public static void main(String[] args) throws NumberFormatException, IOException {
		for (int i = 2; i <= 999; i++) {
			primes[i] = true;
		}

		for (int i = 2; i <= Math.sqrt(999); i++) {
			if (primes[i]) {
				for (int j = i * 2; j <= 999; j += i) {
					primes[j] = false;
				}

			}
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			int N = Integer.parseInt(br.readLine());
			int z;
			int cnt = 0;
			boolean[][] visited = new boolean[N + 1][N + 1];
			for (int x = 2; x <= N - 4; x++) {
				for (int y = 2; y <= N - 2; y++) {
					z = N - x - y;
					if (z < 0) continue;
					if (primes[x] && primes[y] && primes[z] && !visited[x][y] && !visited[x][z]) {
						cnt++;
						visited[x][y] = visited[y][x] = true;
						visited[x][z] = visited[z][x] = true;
					}
				}
			}
			
			System.out.printf("#%d %d\n", t, cnt);

		}

	}
}
