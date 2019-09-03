package Problem_3459;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int cnt;
		long number;
		for (int t = 1; t <= T; t++) {
			cnt = 0;
			sb.append("#").append(t).append(" ");
			number = Long.parseLong(br.readLine());
			long n_ = 1;
			number -= n_;
			
			while(number >0) {
				n_ *=4;
				number -= n_;
				cnt++;
				if(number <= 0) break;
				number -= n_;
				cnt++;
			}
			
			if (cnt % 2 == 0) {
				sb.append("Bob");
			} else {
				sb.append("Alice");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());

	}
}
