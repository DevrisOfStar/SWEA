package Problem_7964;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
	static int[] arr = new int[300000];
	static int N, D, cnt;
	
	public static void dp() {
		int[] cnt_door = new int[N];
		for(int i = 0; i <D;i++) {
			if(arr[i] == 0) cnt_door[i] = 1;
		}
		
		for(int i = D; i<N; i++) {
			int min = Integer.MAX_VALUE;
			for(int j = 1; j <= D;j++) {
				if(min > cnt_door[i-j]) min = cnt_door[i-j];
			}
			if(arr[i] == 0) {
				min +=1;
			}
			cnt_door[i] = min;
		}
		cnt = cnt_door[N-1];
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			String[] temp = br.readLine().split(" ");
			N = Integer.parseInt(temp[0]);
			D = Integer.parseInt(temp[1]);
			cnt = 0;
			temp = br.readLine().split(" ");
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(temp[i]);
			}
			
			dp();

			System.out.printf("#%d %d\n", t, cnt);

			for (int i = 0; i < N; i++)
				arr[i] = 0;

		}
	}
}
