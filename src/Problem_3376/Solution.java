package Problem_3376;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	static long[] arr = new long[101];
	
	public static long P(long a) {
		if(arr[(int)a] > 0) return arr[(int)a];
		else if(a == 1 || a == 2 || a== 3) return 1;
		else return arr[(int)a] = P(a-2) + P(a-3);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for(int t = 1; t <= T; t++) {
			long K = Long.parseLong(br.readLine());
			System.out.printf("#%d %d\n", t, P(K));
			
		}
	}
}
