package Problem_4299;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int d, h, m;
		int sum;
		for(int t = 1; t <= T; t++) {
			sum = 0;
			d = sc.nextInt();
			h = sc.nextInt();
			m = sc.nextInt();
			
			sum = (d-11)*24*60 + (h-11) * 60 + (m-11);
			if(sum < 0) sum = -1;
			System.out.printf("#%d %d\n",t, sum);
		}
	}
}
