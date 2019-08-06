package Problem_1228;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int t = 1; t <= 10; t++) {
			int k = Integer.parseInt(br.readLine());
			List<String> arr = new ArrayList<>();
			String[] s = br.readLine().trim().split(" ");
			for (int i = 0; i < s.length; i++) {
				arr.add(s[i]);
			}
			int n = Integer.parseInt(br.readLine());
			String[] op = br.readLine().trim().split(" ");
			int cnt = 0;
			for (int i = 0; i < n; i++) {
				String option = op[cnt++];
				int start = Integer.parseInt(op[cnt++]);
				int count = Integer.parseInt(op[cnt++]);

				start = start > arr.size() ? arr.size() : start;

				String[] temp = new String[count];
				for (int j = temp.length - 1; j >= 0; j--) {
					temp[j] = op[cnt++];
				}

				for (int j = 0; j < temp.length; j++) {
					arr.add(start, temp[j]);
				}

			}
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 10; i++)
				sb.append(arr.get(i) + " ");
			System.out.printf("#%d %s\n", t, sb.toString());
		}
	}
}
