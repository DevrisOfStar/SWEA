package Problem_4676;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String str;
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= T; t++) {
			str = br.readLine();
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[str.length()+1];
			String[] temp = br.readLine().split(" ");
			sb.append("#").append(t).append(" ");
			for(int i = 0 ; i < N; i++) arr[Integer.parseInt(temp[i])]++;
			
			for(int i = 0; i < str.length();i++) {
				if(arr[i] > 0) {
					for(int j = 0 ; j < arr[i]; j++) sb.append('-');
				}
				sb.append(str.charAt(i));
			}
			if(arr[str.length()] > 0)
				for(int j = 0 ; j < arr[str.length()]; j++) sb.append('-');
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
