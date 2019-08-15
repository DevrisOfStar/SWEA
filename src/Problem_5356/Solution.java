package Problem_5356;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		String a = null;
		String b = null;
		String c = null;
		String d = null;
		String e = null;

		for (int t = 1; t <= T; t++) {
			a = br.readLine();
			b = br.readLine();
			c = br.readLine();
			d = br.readLine();
			e = br.readLine();
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i < 15; i++) {
				if(a.length() > i) sb.append(a.charAt(i));
				if(b.length() > i) sb.append(b.charAt(i));
				if(c.length() > i) sb.append(c.charAt(i));
				if(d.length() > i) sb.append(d.charAt(i));
				if(e.length() > i) sb.append(e.charAt(i));
			}
			
			System.out.printf("#%d %s\n", t, sb.toString());
		}
	}
}
