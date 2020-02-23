package Problem_1208;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int ans;
		int[] arr = new int[100];
		
		for(int t = 1; t<=10;t++) {
			sb.append("#").append(t).append(" ");
			ans = 0;
			int cnt = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int i = 0; i<arr.length; i++) arr[i] = Integer.parseInt(st.nextToken());
			for(int i = 0; i<cnt;i++) {
				Arrays.sort(arr);
				arr[0]++;
				arr[99]--;
			}
			
			Arrays.sort(arr);
			
			ans = arr[99] - arr[0];
			
			
			sb.append(ans).append("\n");
		}
		
		System.out.print(sb);
	}
}
