package Problem_7102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N, M, max;
		int[] arr = new int[41];
		String str;
		for(int t = 1; t <=T; t++) {
			str = br.readLine();
			sb.append("#").append(t).append(" ");
			N = Integer.parseInt(str.split(" ")[0]);
			M = Integer.parseInt(str.split(" ")[1]);
			Arrays.fill(arr, 0);
			max = 0;
			for(int i = 1; i <=N;i++) {
				for(int j = 1; j<=M;j++) {
					arr[i+j]++;
				}
			}
			
			for(int i = 1; i<=40; i++) {
				if(arr[i] > max) {
					max = arr[i];
					str = String.valueOf(i);
				}
				else if(arr[i] == max) {
					str += " " + String.valueOf(i);
				}
			}
			
			sb.append(str.trim()).append("\n");
		}
		System.out.print(sb.toString());
	}
}
