package Problem_6718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			sb.append("#").append(t).append(" ");
			double a = Double.parseDouble(br.readLine())/1000;
			
			if(a < 0.1) sb.append(0);
			else if (a < 1) sb.append(1);
			else if (a < 10) sb.append(2);
			else if( a< 100) sb.append(3);
			else if( a< 1000) sb.append(4);
			else sb.append(5);
			sb.append("\n");
		}
		
		System.out.print(sb.toString());

	}
}
