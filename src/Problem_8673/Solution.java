package Problem_8673;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int total = 0;
		int k = 0;
		String[] temp;
		List<Integer> list;
		List<Integer> tempList = new ArrayList<Integer>();
		for (int t = 1; t <= T; t++) {
			total = 0;
			sb.append("#").append(t).append(" ");
			k = Integer.parseInt(br.readLine());
			list = new ArrayList<Integer>();
			temp = br.readLine().split(" ");

			for (int i = 0; i < Math.pow(2, k); i++) {
				list.add(Integer.parseInt(temp[i]));
			}

			do {
				for (int i = 0; i < list.size() / 2; i++) {
					if (list.get(i * 2) > list.get(i * 2 + 1)) {
						total += (list.get(i * 2) - list.get(i * 2 + 1));
						tempList.add(list.get(i * 2));
					} else {
						total += (list.get(i * 2 + 1) - list.get(i * 2));
						tempList.add(list.get(i * 2 + 1));
					}
				}
				list.clear();
				list.addAll(tempList);
				tempList.clear();
			} while (list.size() > 1);
			sb.append(total).append("\n");
		}

		System.out.print(sb.toString());
	}
}
