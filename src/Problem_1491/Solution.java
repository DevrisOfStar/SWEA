package Problem_1491;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 1; t<=T; t++) {
			long N = sc.nextLong();
			long A = sc.nextLong();
			long B = sc.nextLong();
			
			long min = Integer.MAX_VALUE;
			
			for(long C = 1; C<=N/2; C++) {
				for(long R = C; C*R<=N; R++) {
					long value = A * (R-C) + B*(N-R*C);
					if(value < min) min = value;
				}
			}
			
			System.out.printf("#%d %d\n",t,min);
		}
	}
}
