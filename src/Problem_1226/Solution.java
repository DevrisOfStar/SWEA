package Problem_1226;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class data {
	int x;
	int y;

	public data(int x, int y) {
		this.x = x;
		this.y = y;
	}

}

public class Solution {
	
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	public static boolean solution(int[][] arr, data start) {
		Queue<data> q = new LinkedList<>();
		q.add(start);
		
		while(!q.isEmpty()) {
			data d = q.poll();
			
			if(arr[d.x][d.y]==3) {
				return true;
			}
			
			for(int i = 0; i < 4; i++) {
				if(arr[d.x+dx[i]][d.y+dy[i]] != 1) {
					q.add(new data(d.x+dx[i], d.y+dy[i]));
					if(arr[d.x+dx[i]][d.y+dy[i]]!=3)
						arr[d.x+dx[i]][d.y+dy[i]]= 1;
				}
			}
		} // end while
		
		
		return false;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		data start = null;
		for (int t = 1; t <= 10; t++) {
			int a = Integer.parseInt(br.readLine());
			int[][] arr = new int[16][16];
			for (int i = 0; i < 16; i++) {
				String str = br.readLine().trim();
				for (int j = 0; j < 16; j++) {
					arr[i][j] = str.charAt(j) - '0';
					if (arr[i][j] == 2) {
						start = new data(i,j); 
					}
				}
			}
			
			int answer = solution(arr, start) ? 1 : 0;
			System.out.printf("#%d %d\n", t, answer);
		}
	}
}
