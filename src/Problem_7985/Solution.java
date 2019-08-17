package Problem_7985;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	static int K;
	static String[] arr;
	static StringBuilder[] sb;
	public static void print(int k, int start, int end) {
		if(k == K) return;
		else {
			int mid = (start+end)/2;
			sb[k].append(arr[mid]).append(" ");
			print(k+1, start, mid-1);
			print(k+1, mid+1, end);
		}
	}
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t<=T;t++) {
			K = Integer.parseInt(br.readLine());
			sb = new StringBuilder[K];
			arr = br.readLine().split(" ");
			
			for(int i = 0; i < sb.length;i++) {
				sb[i] = new StringBuilder();
			}
			sb[0].append("#").append(t).append(" ");
			print(0, 0, arr.length-1);
			
			for(int i = 0; i < sb.length;i++) {
				System.out.println(sb[i].toString());
			}
		}
		
	}
}
