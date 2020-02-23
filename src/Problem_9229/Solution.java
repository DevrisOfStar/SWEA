package Problem_9229;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[1001];
		int N, M, temp;
		String buf;
		StringBuilder sb = new StringBuilder();
		int ans = -1;
		for(int t = 1; t<=T; t++) {
			sb.append("#").append(t).append(" ");
			ans = -1;
			buf = br.readLine();
			
			N = Integer.parseInt(buf.split(" ")[0]);
			M = Integer.parseInt(buf.split(" ")[1]);
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			for(int i = 0 ; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j<N;j++) {
					if(i==j) continue;
					temp = arr[i]+arr[j];
					
					if(ans < temp && M >= temp) {
						ans = temp;
					}
				}
			}
			
			
			sb.append(ans).append("\n");
		}
		System.out.print(sb.toString());
	}
}
