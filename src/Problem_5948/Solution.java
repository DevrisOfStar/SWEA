package Problem_5948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static int[] a = new int[3];
	public static int cnt = 0;
	public static int[][] arr;
	public static void gett(int idx, int target) {
		if(idx == 3) {
			arr[cnt][0] = a[0];
			arr[cnt][1] = a[1];
			arr[cnt][2] = a[2];
			cnt++;
			
			return;
		}
		else if(target == 7) {
			return;
		}
		else {
			a[idx] = target;
			gett(idx+1, target+1);
			gett(idx, target+1);
		}
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		arr = new int[35][3];
		gett(0, 0);
		
		int[] answer = new int[35];
		int b = 0;
		
		int[] numbers = new int[7];
		for(int t = 1; t<=T; t++) {
			b = 0;
			sb.append("#").append(t).append(" ");
			st = new StringTokenizer(br.readLine(), " ");
			for(int i = 0 ; i < 7; i++) numbers[i] = Integer.parseInt(st.nextToken());
			
			for(int i = 0 ; i< 35; i++) {
				answer[i] = numbers[arr[i][0]] + numbers[arr[i][1]] + numbers[arr[i][2]];
			}
			
			Arrays.sort(answer);
			cnt = 0;
			for(int i = 34; i >=0; i--) {
				if(b!=answer[i]) {
					b = answer[i];
					cnt++;
				}
				if(cnt == 5) {
					sb.append(answer[i]).append("\n");
					break;
				}
			}
		}
		
		System.out.print(sb.toString());
	}
}
