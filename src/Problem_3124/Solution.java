package Problem_3124;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

class data implements Comparable<data> {
	int start;
	int end;
	long value;

	public data(int start, int end, long value) {
		this.start = start;
		this.end = end;
		this.value = value;
	}

	@Override
	public int compareTo(data o) {
		// TODO Auto-generated method stub
		return this.value > o.value ? 1 : -1;
	}

}

public class Solution {

	static int V, E;
	static int[] arr;

	public static int find(int i) {
		if (i == arr[i])
			return i;
		else
			return arr[i] = find(arr[i]);
	}

	public static void union(int i, int j) {
		int i_ = find(i);
		int j_ = find(j);
		if (i_ != j_)
			arr[i_] = j_;

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		long result;
		PriorityQueue<data> pq = new PriorityQueue<>();
		String[] str;
		for (int t = 1; t <= T; t++) {
			str = br.readLine().split(" ");
			V = Integer.parseInt(str[0]);
			E = Integer.parseInt(str[1]);
			arr = new int[V + 1];
			result = 0;
			for (int i = 1; i <= V; i++) {
				arr[i] = i;
			}

			for (int i = 0; i < E; i++) {
				str = br.readLine().split(" ");
				pq.offer(new data(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Long.parseLong(str[2])));
			}
			int cnt = 0;
			while (!pq.isEmpty() && cnt < V - 1) {
				data d = pq.poll();
				int start = d.start;
				int end = d.end;
				int a = find(start);
				int b = find(end);
				if (a == b)
					continue;

				union(start, end);
				result += d.value;
				cnt++;
			}
			System.out.printf("#%d %d\n", t, result);
		}
	}
}
