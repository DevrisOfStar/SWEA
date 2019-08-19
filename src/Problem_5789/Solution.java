package Problem_5789;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] arr;		
		StringBuilder sb = new StringBuilder();
		for (int t = 1; t <= T; t++) {
			String temp = br.readLine();
			sb.append("#").append(t).append(" ");
			int N = Integer.parseInt(temp.split(" ")[0]);
			int Q = Integer.parseInt(temp.split(" ")[1]);
			arr = new int[N+1];
			
			for(int i = 1; i <= Q; i++) {
				temp = br.readLine();
				int a = Integer.parseInt(temp.split(" ")[0]);
				int b = Integer.parseInt(temp.split(" ")[1]);
				
				for(int j = a ; j <=b; j++) {
					arr[j] = i;
				}
			}
			
			
			for(int i = 1; i<=N ; i++) {
				sb.append(arr[i]).append(" ");
			}
			
			sb.append("\n");
		}
		System.out.print(sb.toString());

	}
}
