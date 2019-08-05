package Problem_3314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			String[] str = br.readLine().trim().split(" ");
			int avg = 0;
			for(int i = 0; i < str.length; i++) {
				int a = Integer.parseInt(str[i]);
				if(a < 40) avg +=40;
				else avg+= a;
			}
			avg /= str.length;
			System.out.printf("#%d %d\n", t, avg);
		}
	}
}
