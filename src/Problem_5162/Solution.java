package Problem_5162;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			String[] temp = br.readLine().split(" ");
			int a = Integer.parseInt(temp[0]);
			int b = Integer.parseInt(temp[1]);
			int c = Integer.parseInt(temp[2]);
			
			int max = Integer.MIN_VALUE;
			int k = 0;
			for(int i = 0 ; i <=c/a; i++) {
				 k = (c-a*i)/b + i;
				 max = max < k ? k : max;
			}
			System.out.printf("#%d %d\n",t, max);
		}
	}
}
