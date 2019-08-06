package Problem_7732;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] t1 = new int[3];
		int[] t2 = new int[3];
		int[] t3 = new int[3];
		int T = Integer.parseInt(br.readLine().trim());
		for(int t = 1; t<=T;t++) {
			String s = br.readLine();
			int cnt = 0;
			for(String z : s.split(":")) {
				t1[cnt++] = Integer.parseInt(z);
			}
			
			s = br.readLine();
			cnt = 0;
			for(String z : s.split(":")) {
				t2[cnt++] = Integer.parseInt(z);
			}
			
			for(int i = 2; i>=0; i--) {
				t3[i] = t2[i] - t1[i];
				if(i!=0 && t3[i] < 0) {
					t3[i] += 60;
					t2[i-1]-= 1;
				}
				else if(t3[i] < 0) {
					t3[i] +=24;
				}
			}
			
			System.out.printf("#%d %02d:%02d:%02d\n",t, t3[0],t3[1],t3[2]);
			
		}
	}
}
