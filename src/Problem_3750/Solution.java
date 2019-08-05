package Problem_3750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <=T; t++) {
			String str = br.readLine().trim();
			int cnt = str.length() == 1 ? str.charAt(0)-'0' : 0;
			while(str.length() > 1) {
				cnt = 0;
				for(int i = 0; i < str.length();i++) {
					cnt += (str.charAt(i) - '0');
				}
				str = String.valueOf(cnt);
			}
			
			
			System.out.printf("#%d %d\n", t, cnt);
			
			
		}
	}
}
