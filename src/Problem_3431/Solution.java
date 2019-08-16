package Problem_3431;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String[] temp;
		int a, b, c;
		for (int t = 1; t <= T; t++) {
			temp = br.readLine().split(" ");
			a = Integer.parseInt(temp[0]);
			b = Integer.parseInt(temp[1]);
			c = Integer.parseInt(temp[2]);
			sb.append("#").append(t).append(" ");
			if(c < a) sb.append(a-c);
			else if(c <= b) sb.append(0);
			else sb.append(-1);
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
