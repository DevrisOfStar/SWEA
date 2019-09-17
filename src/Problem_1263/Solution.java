package Problem_1263;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int N, min, number;
		int[][] arr = new int[1000][1000];
		StringTokenizer st;
		for (int t = 1; t <= T; t++) {
			st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			min = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
					if(i!=j && arr[i][j] == 0) arr[i][j] = N+1;
				}
			}
			for (int k = 0; k < N; k++) {
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N; j++) {
						arr[i][j] = Math.min(arr[i][k]+arr[k][j], arr[i][j]);
					}
				}
			}
			min = Integer.MAX_VALUE;
			for (int i = 0; i < N; i++) {
				number = 0;
				for (int j = 0; j < N; j++) {
					number+= arr[i][j];
				}
				if(min > number) min = number;
			}

			System.out.printf("#%d %d\n", t, min);
		}

	}
}
