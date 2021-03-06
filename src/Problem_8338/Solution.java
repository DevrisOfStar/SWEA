package Problem_8338;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {

	static int N;
	static int[] arr = new int[10];
	static int max;

	
	public static int getmax() {
		int a, b;
		int c = 0;
		
		for(int i = 0; i <N;i++) {
			a = c+arr[i];
			b = c*arr[i];
			c = a > b ? a : b;
		}
		return c;
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str;
		for (int t = 1; t <= T; t++) {
			max = Integer.MIN_VALUE;
			N = Integer.parseInt(br.readLine());
			str = br.readLine();
			for (int i = 0; i < N; i++) {
				arr[i] = str.charAt(i*2)-'0';
			}
			
			sb.append("#").append(t).append(" ").append(getmax()).append("\n");
			
		}
		bw.write(sb.toString().trim());
		bw.flush();
	}
}
