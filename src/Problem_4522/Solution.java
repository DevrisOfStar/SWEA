package Problem_4522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1 ; t <= T; t++) {
			StringBuilder sb = new StringBuilder();
			String str = br.readLine();
			System.out.printf("#%d ",t);
			boolean flag = true;
			
			for(int i = 0; i < str.length()/2; i++) {
				if(str.charAt(i) == str.charAt(str.length()-1-i) || str.charAt(i) == '?' || str.charAt(str.length()-1-i) == '?')
					continue;
				else flag = false;
			}
			
			
			if(flag) {
				System.out.println("Exist");
			}
			else {
				System.out.println("Not exist");
			}
			
		}
	}
}
