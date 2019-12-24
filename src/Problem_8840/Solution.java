package Problem_8840;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		Long l;
		for(int t = 1; t<=T; t++) {
			sb.append('#').append(t).append(' ');
			l = Long.parseLong(br.readLine());
			l = Math.multiplyExact((l-1)/2, (l-1)/2);
			
			sb.append(l).append("\n");
		}
		
		System.out.print(sb.toString());
	}
}
