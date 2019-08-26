package Problem_3124;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

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
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		long result;
		PriorityQueue<data> pq = new PriorityQueue<>();
		for (int t = 1; t <= T; t++) {

			V = sc.nextInt();
			E = sc.nextInt();
			arr = new int[V + 1];
			result = 0;
			for (int i = 1; i <= V; i++) {
				arr[i] = i;
			}

			for (int i = 0; i < E; i++) {
				pq.offer(new data(sc.nextInt(), sc.nextInt(), sc.nextLong()));
			}

			while (!pq.isEmpty()) {
				data d = pq.poll();
				int start = d.start;
				int end = d.end;
				int a = find(start);
				int b = find(end);
				if (a == b)
					continue;

				union(start, end);
				result += d.value;

			}
			System.out.printf("#%d %d\n", t, result);
		}
	}
}
