package Problem_3975;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		int a, b, c, d, e, f;
		for (int t = 1; t <= T; t++) {
			sb.append("#").append(t).append(" ");
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			e = a * d;
			f = b * c;
			if(e>f) sb.append("ALICE");
			else if(e==f) sb.append("DRAW");
			else sb.append("BOB");
			sb.append("\n");
		}
		System.out.print(sb.toString());

	}
}
