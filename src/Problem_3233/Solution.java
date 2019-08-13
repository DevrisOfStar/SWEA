package Problem_3233;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t<=T; t++) {
			String temp = br.readLine();
			long a = Long.parseLong((temp.split(" ")[0]));
			long b = Long.parseLong((temp.split(" ")[1]));
			
			System.out.printf("#%d %d\n", t, (a/b)*(a/b));
		}
	}
}
