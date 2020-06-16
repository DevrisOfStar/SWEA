package Problem_1251;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class data implements Comparable<data> {
	int x;
	int y;
	double value;

	public data(int x, int y, double value) {
		this.x = x;
		this.y = y;
		this.value = value;
	}

	@Override
	public int compareTo(data o) {
		// TODO Auto-generated method stub
		return this.value > o.value ? 1 : -1;
	}

}

public class Solution {
	static int[] p;

	public static int find(int i) {
		if (i == p[i]) {
			return i;
		} else {
			return p[i] = find(p[i]);
		}
	}

	public static void union(int i, int j) {
		int rootA = find(i);
		int rootB = find(j);
		if (rootA != rootB)
			p[rootA] = rootB;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int N;
		StringTokenizer st_x;
		StringTokenizer st_y;
		// 우선순위 큐 사용
		PriorityQueue<data> d_ = new PriorityQueue<>();
		double[] x_;
		double[] y_;
		double E;
		double result;
		for (int t = 1; t <= T; t++) {
			result = 0.0;
			N = Integer.parseInt(br.readLine());
			p = new int[N];
			x_ = new double[N];
			y_ = new double[N];
			for(int i = 0; i < p.length; i++) p[i] = i;
			st_x = new StringTokenizer(br.readLine().trim(), " ");
			st_y = new StringTokenizer(br.readLine().trim(), " ");

			for (int i = 0; i < N; i++) {
				x_[i] = Double.parseDouble(st_x.nextToken());
				y_[i] = Double.parseDouble(st_y.nextToken());
			}

			E = Double.parseDouble(br.readLine());

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					// 연결 가능성을 모두 계산하여 우선순위큐에 삽입.
					if(i == j) continue;
					double x__ = x_[j] - x_[i];
					double y__ = y_[j] - y_[i];
					double a = E * (x__ * x__ + y__ * y__);
					d_.add(new data(i, j, a));
				}
			}

			while (!d_.isEmpty()) {
				data d__ = d_.poll();
				int start = d__.x;
				int end = d__.y;

				int a = find(start);
				int b = find(end);
				
				// 같은 집합이면 패스
				if (a == b)
					continue;
				// 다른집합이면, 같은 집합으로 합치고
				union(start, end);
				// 결과값에 더함
				result += d__.value;
			}

			System.out.printf("#%d %.0f\n", t, result);
		}

	}
}
