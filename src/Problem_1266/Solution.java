package Problem_1266;

import java.util.Scanner;

public class Solution {
	static boolean[] isprime = { false, false, true, true, false, true, false, true, false, false, false, true, false,
			true, false, false, false, true, false };

	public static float func(int k, float p) {
		long a = 1;
		float b = 1.0f;
		float c = 1.0f;
		
		for (int i = 18; i > 18-k; i--)
			a *= i;
		for (int i = 1; i <= k; i++)
			a /= i;
		
		int t = k;
		float d = p;
		while (t != 0) {
				b *= d;
				t--;
		}
		t = 18 - k;
		float e = 1.0f - p;
		while (t != 0) {
				c *= e;
				t--;
		}
		return a * b * c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int a, b;
		for (int t = 1; t <= T; t++) {
			float c = 0;
			float d = 0;
			a = sc.nextInt();
			b = sc.nextInt();

			for (int i = 1; i < isprime.length; i++)
				if (isprime[i]) {
					c += func(i, (float) (a / 100.0));
					d += func(i, (float) (b / 100.0));
				}
			float e = c*d + (1-c) * d + (1-d)*c;
			System.out.printf("#%d %7f\n", t, e);
		}
	}
}
