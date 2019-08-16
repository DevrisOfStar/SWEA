package Problem_7532;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		String str;
		for (int t = 1; t <= T; t++) {
			str = br.readLine();
			int a = Integer.parseInt(str.split(" ")[0]);
			int b = Integer.parseInt(str.split(" ")[1]);
			int c = Integer.parseInt(str.split(" ")[2]);
			int i;
			int k;
			for(i = 0; ; i++) {
				k = i*365 + a;
				if((k-b)%24 == 0)
					if((k-c)%29 == 0)
						break;
			}
			System.out.printf("#%d %d\n", t, k);
			
		}
	}
}
