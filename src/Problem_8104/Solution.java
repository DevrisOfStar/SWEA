package Problem_8104;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 완료 */
public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		String[] str;
		for (int t = 1; t <= T; t++) {
			 str = br.readLine().trim().split(" ");
			long n = Long.parseLong(str[0]);
			long k = Long.parseLong(str[1]);

			long answer = 0;
			long num = 0;
			num = (n + 1) / 2;
			answer = 2 * k * num;
			if (n % 2 == 0) {
				answer = answer * num + num;
			} else {
				answer = answer * (num - 1) + num;
			}

			int cnt = 0;			
			System.out.printf("#%d ",t);
			for (int i = 0; i < k; i++) {
				System.out.print((answer + cnt) + " ");
				if(n%2 == 1) cnt++;
			}

			System.out.println();
		}
	}
}
