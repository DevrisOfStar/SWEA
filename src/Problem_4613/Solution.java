package Problem_4613;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	static int N, M;
	static int[][] arr;
	static int min;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String str;
		char temp;
		for(int t = 1; t<=T; t++) {
			str = br.readLine();
			N = Integer.parseInt(str.split(" ")[0]);
			M = Integer.parseInt(str.split(" ")[1]);
			
			arr = new int[N][M];
			
			for(int i = 0; i < N; i++) {
				str = br.readLine();
				for(int j = 0; j< M; j++) {
					temp = str.charAt(j);
					if(temp == 'W') {
						arr[i][j] = 0;
					}
					else if(temp =='B') {
						arr[i][j] = 1;
					} else {
						arr[i][j] = 2;
					}
				}
			}
			
			min = Integer.MAX_VALUE;
			
			func(0, 0, 0);
			System.out.printf("#%d %d\n", t, min);
		}
	}
	
	public static void func(int cnt, int line, int color) {
		if(line == N-1 && color == 2) {
			int n = 0;
			for(int i = 0; i < M; i++) {
				if(arr[line][i] != color) n++;
			}
			cnt = cnt+n;
			if(cnt < min) min = cnt;
			return;
		}
		else if(color >= 3) return;
		else if(line >= N) return;
		else {
			int n = 0;
			for(int i = 0; i < M; i++) {
				if(arr[line][i] != color) n++;
			}
			
			func(cnt+n, line+1, color);
			func(cnt+n, line+1, color+1);
		}
	}
}
