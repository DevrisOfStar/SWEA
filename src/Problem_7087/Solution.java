package Problem_7087;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			
			for(int i = 0; i < arr.length; i++) {
				arr[i] = br.readLine().charAt(0) -'A';
			}
			Arrays.sort(arr);
			int max = 0;
			
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == max) {
					max+=1;
				}
			}
			
			System.out.printf("#%d %d\n",t,max);
		}
	}
}
