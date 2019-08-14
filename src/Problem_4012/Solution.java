package Problem_4012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

	static int[][] arr;
	static boolean[] isvisited;
	static int min;
	static int N;
	public static void dfs(int n, int count) {
		if(count == N/2) {
			// 계산
			int a = 0;
			int b = 0;
			for(int i = 0; i < N;i++) {
				for(int j = 0 ; j <N;j++) {
					if(isvisited[i] && isvisited[j]) {
						a+= arr[i][j];
						a+= arr[j][i];
					}
					else if(!isvisited[i] && !isvisited[j]) {
						b+= arr[i][j];
						b+= arr[j][i];
					}
						
				}
			}
			a/=2;
			b/=2;
			int cha = (int)Math.abs(a-b);
			min = min > cha ? cha : min;
			return;
		}
		if(n >= N) return;
		else {
			isvisited[n] = true;
			dfs(n+1, count+1);
			isvisited[n] = false;
			dfs(n+1, count);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		String[] Temp;
		for (int t = 1; t <= T; t++) {
			N = Integer.parseInt(br.readLine());
			arr = new int[N][N];
			isvisited = new boolean[N];
			for (int i = 0; i < N; i++) {
				Temp = br.readLine().split(" ");
				for (int j = 0; j < N; j++) {
					arr[i][j] = Integer.parseInt(Temp[j]);
				}
			}
			
			min = Integer.MAX_VALUE;

			dfs(0, 0);
			System.out.printf("#%d %d\n", t, min);
		}
	}
}
