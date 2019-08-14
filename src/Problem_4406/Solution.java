package Problem_4406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s,"aeiou");
			StringBuilder sb = new StringBuilder();
			while(st.hasMoreTokens()) {
				sb.append(st.nextToken());
			}
			
			System.out.printf("#%d %s\n",t, sb.toString());
		}
	}
}
