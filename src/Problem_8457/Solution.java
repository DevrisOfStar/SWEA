package Problem_8457;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int N, B, E, cnt;
		int temp;
		for(int t = 1; t <= T; t++) {
			cnt = 0;
			st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken()); 
			E = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i = 0 ; i < N; i++) {
				int num = Integer.parseInt(st.nextToken());

				for(int n = B; n >= 0; n-=num) {
					if(num >= n-E && num <= E+n) {
						//System.out.println ((n-E)+ "<=" + num + "<=" + (E+n));
						cnt++;
						break;
					}
				}
				
				
			}
			
			System.out.printf("#%d %d\n",t, cnt);
		}
}}
