package Problem_9088;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int arr[] = new int[10001];
		int max;
		int max_n;
		String str;
		int a;
		int N,K;
		for(int t = 1; t<=T;t++) {
			max = Integer.MIN_VALUE;
			max_n = Integer.MIN_VALUE;
			sb.append("#").append(t).append(" ");
			
			str = br.readLine();
			N = Integer.parseInt(str.split(" ")[0]);
			K = Integer.parseInt(str.split(" ")[1]);
			
			for(int i = 0; i < N; i++) {
				str = br.readLine();
				a = Integer.parseInt(str);
				if(max_n < a) max_n = a;
				arr[a]++;
			}
			
			for(int b = 0; b<=K; b++) {
				a = 0;
				
			
				for(int i = 1; i <= 1+b;i++) {
					a += arr[i];
				}
				if(max < a) max = a;
				
				for(int i = b+2; i <= max_n; i++) {
					a += arr[i];
					a -= arr[i-b-1];
					if(max < a) max = a;
				}
			}
			
			sb.append(max).append("\n");
			Arrays.fill(arr, 0);
		}
		
		System.out.print(sb.toString());
		
	}}
