package Problem_7465;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	static boolean[][] arr;
	static boolean[] isvisited;
	static int N;
	static int M;
	public static int bfs() {
		int cnt = 0;
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i<=N; i++) {
			for(int j = 1; j<=N; j++) {
				if(arr[i][j] && !isvisited[i]) {
					isvisited[j] = true;
					q.add(j);
					cnt++;
				}
				
				while(!q.isEmpty()) {
					int data = q.poll();
					for(int k = 1; k <=N; k++) {
						if(arr[data][k] && !isvisited[k]) {
							q.add(k);
							isvisited[k] = true;
						}
					}
				}
			}
		}
		
		for(int i = 1; i <=N;i++)
			if(!isvisited[i]) cnt++;
		
		return cnt;
	}
	
 	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String temp;

		for (int t = 1; t <= T; t++) {
			temp = br.readLine();
			N = Integer.parseInt(temp.split(" ")[0]);
			M = Integer.parseInt(temp.split(" ")[1]);

			arr = new boolean[N + 1][N + 1];
			isvisited = new boolean[N+1];
			for (int i = 0; i < M; i++) {
				temp = br.readLine();
				int a = Integer.parseInt(temp.split(" ")[0]);
				int b = Integer.parseInt(temp.split(" ")[1]);
				arr[a][b] = true;
                arr[b][a] = true;
			}
			System.out.printf("#%d %d\n", t, bfs());
		}
	}
}
