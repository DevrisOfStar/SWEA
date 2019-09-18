package Problem_6730;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int N;
		int a,b;
		int c,d;
		StringTokenizer st;
		for(int t = 1; t<=T; t++) {
			c = 0;
			d = 0;
			N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), " ");
			a = Integer.parseInt(st.nextToken());
			for(int i = 0 ; i < N-1; i++) {
				b = Integer.parseInt(st.nextToken());
				if(a > b && d < a-b) {
					d = a-b;
				}
				else if( a< b && c < b- a) {
					c = b-a;
				}
				a = b;
			}
			
			System.out.printf("#%d %d %d\n",t, c, d);
		}
		
	}
}
