package Problem_3499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			int k = Integer.parseInt(br.readLine());
			String[] arr = br.readLine().trim().split(" ");

			StringBuilder sb = new StringBuilder("#" + t + " ");
			if (k % 2 == 0) {
				for (int i = 0; i < k/2; i++) {
					sb.append(arr[i] + " ");
					sb.append(arr[i+(k/2)] + " ");
				}
			} else {
				for (int i = 0; i < k/2; i++) {
					sb.append(arr[i] + " ");
					sb.append(arr[i+1+(k/2)] + " ");
				}
				sb.append(arr[k/2] +" ");
			}

			System.out.println(sb.toString());

		}
	}
}
