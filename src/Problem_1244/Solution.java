package Problem_1244;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class data {
	int number;
	int cnt;

	public data(int number, int cnt) {
		this.number = number;
		this.cnt = cnt;
	}

}

public class Solution {

	public static int solution(String[] strs) {
		int a = Integer.parseInt(strs[0]);
		int b = Integer.parseInt(strs[1]);
		int max = a;
		Queue<data> q = new LinkedList<>();
		List<Integer> l = new LinkedList<>();
		q.add(new data(a, 0));
		l.add(a);

		while (!q.isEmpty()) {
			data d = q.poll();

			if (d.cnt == b || d.cnt == String.valueOf(d.number).length()) {
				if (b % 2 == 1 && b > String.valueOf(d.number).length()) {
					for (int i = 0; i < String.valueOf(d.number).length(); i++) {
						for (int j = i + 1; j < String.valueOf(d.number).length(); j++) {
							char[] s = String.valueOf(d.number).toCharArray();
							char temp = s[i];
							s[i] = s[j];
							s[j] = temp;
							int c = Integer.parseInt(String.valueOf(s));
							if (max < c)
								max = c;
						}
					}
				} else {

					if (max < d.number)
						max = d.number;
				}
				continue;
			} else {
				for (int i = 0; i < String.valueOf(d.number).length(); i++) {
					for (int j = i + 1; j < String.valueOf(d.number).length(); j++) {
						char[] s = String.valueOf(d.number).toCharArray();
						char temp = s[i];
						s[i] = s[j];
						s[j] = temp;
						int c = Integer.parseInt(String.valueOf(s));

						if (d.number <= c) {
							q.add(new data(c, d.cnt + 1));
						}

					}
				}
			}
		}

		return max;

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			String[] str = br.readLine().split(" ");
			System.out.printf("#%d %d\n", t, solution(str));

		}
	}
}
