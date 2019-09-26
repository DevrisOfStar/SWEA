package Problem_4698;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution {
	static int prime[] = new int[1000001];

	public static void main(String[] args) throws NumberFormatException, IOException {
		for (int i = 2; i <= 1000000; i++) {
			prime[i] = i;
		}

		for (int i = 2; i <= 1000000; i++) {
			if (prime[i] == 0)
				continue;
			for (int j = i + i; j <= 1000000; j += i) {
				prime[j] = 0;
			}
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String[] str;
		int a, b, cnt;
		for (int t = 1; t <= T; t++) {
			str = br.readLine().split(" ");
			cnt = 0;
			sb.append("#").append(t).append(" ");
			a = Integer.parseInt(str[1]);
			b = Integer.parseInt(str[2]);

			for (int i = a; i <= b; i++) {
				if (prime[i] != 0 && String.valueOf(prime[i]).contains(str[0])) {
					cnt++;
				}
			}
			sb.append(cnt).append("\n");
		}
		System.out.print(sb.toString());

	}
}
