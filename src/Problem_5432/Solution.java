package Problem_5432;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int cnt, num;
		char before =' ';
		String str;
		for(int t = 1 ; t <=T; t++) {
			cnt = 0; num = 0;
			str = br.readLine();
			for(int i = 0; i < str.length(); i++) {
				char d = str.charAt(i);
				
				if(d == '(') {
					cnt++;
				}
				else {
					if(before == '(') {
						cnt--;
						num += cnt;
					}
					else {
						cnt = cnt - 1 > 0 ? cnt -1 : 0;
						num++;
					}
				}
				
				before = d;
				
			}
			System.out.printf("#%d %d\n",t, num);
			
		}
	}
}
