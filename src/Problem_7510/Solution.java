package Problem_7510;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int number,cnt;
		for (int t = 1; t <= T; t++) {
			number = Integer.parseInt(br.readLine());
			cnt = 0;
			for(int i = 1; i*(i+1)/2 <= number; i++) {
				if((number - i*(i+1)/2) % i == 0) cnt++;
			}
			
			System.out.printf("#%d %d\n", t, cnt);
		}
	}
}
