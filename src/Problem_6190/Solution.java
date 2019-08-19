package Problem_6190;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	static int[] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String[] temp;
		for(int t = 1; t <= T; t++) {
			int N = Integer.parseInt(br.readLine());
			int k;
			arr = new int[N];
			temp = br.readLine().split(" ");
			int max = -1;
			for(int i = 0; i < N; i++)
				arr[i] = Integer.parseInt(temp[i]);
			
			for(int i = 0 ; i < N-1; i++) {
				for(int j = i+1 ; j <N;j++) {
					int a = arr[i] * arr[j];
					if(a < max) continue;
					else {
						String b = String.valueOf(a);
						for(k = 0; k<b.length()-1; k++) {
							if(b.charAt(k) > b.charAt(k+1)) break;
						}
						if(k == b.length()-1) max = max < a ? a : max;
					}
				}
			}
			System.out.printf("#%d %d\n", t, max);
		}
	}
}
