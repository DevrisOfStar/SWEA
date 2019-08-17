package Problem_2930;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

class data implements Comparable<data> {
	int x;

	public data(int x) {
		this.x = x;
	}

	@Override
	public int compareTo(data o) {
		return this.x < o.x ? 1 : -1;
	}

}

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int t = 1; t <= T; t++) {
			PriorityQueue<data> q = new PriorityQueue<>();
			sb.append("#").append(t);
			int N = Integer.parseInt(br.readLine());
			String[] str;
			for (int i = 0; i < N; i++) {
				str = br.readLine().split(" ");

				switch (str[0]) {
				case "1":
					q.offer(new data(Integer.parseInt(str[1])));
					break;
				case "2":
					sb.append(" ");
					data a = q.poll();
					if (a == null)
						sb.append("-1");
					else
						sb.append(a.x);
					break;
				}
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());			

	}
}
