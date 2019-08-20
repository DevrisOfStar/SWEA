package Problem_5607;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static long[] f = new long[1000000 + 1];
	static long m = 1234567891l;

	public static void main(String[] args) throws NumberFormatException, IOException {
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		f[0] = 1;
		f[1] = 1;
		for (int i = 2; i < f.length; i++) {
			f[i] = f[i - 1] * i;
			f[i] %= m;
		}
		for (int t = 1; t <= T; t++) {
			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			long m_ = m - 2;
			long a = 1;
			long c = f[r];
			while (m_ != 0) {
				if (m_ % 2 == 0) {
					c *= c;
					c %= m;
					m_/=2;
				} else {
					a *= c;
					a %= m;
					m_--;
				}
			}
			
			long b = 1;
			m_ = m - 2;
			c = f[n-r];
			while (m_ != 0) {
				if (m_ % 2 == 0) {
					c *= c;
					c %= m;
					m_/=2;
				} else {
					b *= c;
					b %= m;
					m_--;
				}
			}
			long answer = (((a * b)%m) * f[n]) % m;
			System.out.printf("#%d %d\n", t, answer);
		}

	}
}
