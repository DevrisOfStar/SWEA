package Problem_8741;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String[] arr;

		for (int t = 1; t <= T; t++) {
			sb.append("#").append(t).append(" ");
			arr = br.readLine().split(" ");
			for (int i = 0; i < arr.length; i++)
				sb.append(String.valueOf(arr[i].charAt(0)).toUpperCase());
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
