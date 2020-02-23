package Problem_1860;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String buf;
		int N,M,K;
		int[] arr;
		int cnt;
		int T = Integer.parseInt(br.readLine());
		boolean isComplete = true;
		for(int t = 1; t<=T; t++) {
			sb.append("#").append(t).append(" ");
			buf = br.readLine();
			cnt = 0;
			isComplete = true;
			N = Integer.parseInt(buf.split(" ")[0]);
			M = Integer.parseInt(buf.split(" ")[1]);
			K = Integer.parseInt(buf.split(" ")[2]);
			arr = new int[N];
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			int time = 0;
			int idx = 0;
			int i = 0;
			while(i<=arr[N-1] && idx < N) {
				
				if(time % M == 0 && time != 0) {
					cnt+=K;
					time = 0;
				}
				if(arr[idx] == i && cnt > 0) {
					idx++;
					cnt--;
				}
				else if(arr[idx] == i && cnt == 0) {
					isComplete = false;
					break;
				}
				else {
					i++;
					time++;
				}
			}
			
			
			if(isComplete) sb.append("Possible");
			else sb.append("Impossible");
			
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
