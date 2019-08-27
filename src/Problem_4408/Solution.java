package Problem_4408;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
// tc : 7/10 - 다음에 다시 풀어보기로.
public class Solution {
	static boolean[] corridor = new boolean[200]; // (a-1)/2 - 복도

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		int N, cnt;
		StringTokenizer st;
		Queue<Integer[]> q = new LinkedList<>();
		PriorityQueue<Integer[]> pq = new PriorityQueue<>(new Comparator<Integer[]>() {
			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				// TODO Auto-generated method stub
				
				if (Math.abs(o1[0] - o1[1]) != Math.abs(o2[0] - o2[1])) {
					return Math.abs(o1[0] - o1[1]) > Math.abs(o2[0] - o2[1])? 1 : -1;
				}
				else {
					return o1[0] > o2[0] ? 1 : -1;
				}
				
			}
		});
		for (int t = 1; t <= T; t++) {
			cnt = 0;
			N = Integer.parseInt(br.readLine().trim());
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				pq.offer(new Integer[] { a, b });
			}
			
			while(!pq.isEmpty()) {
				//System.out.println(Arrays.toString(pq.peek()));
				q.offer(pq.poll());
			}
			while (!q.isEmpty()) {
				int size = q.size();
				int start, end;
				for (int i = 0; i < size; i++) {
					boolean flag = false;
					start = q.peek()[0];
					end = q.peek()[1];

					int s = (start - 1) / 2;
					int e = (end - 1) / 2;
					if (s > e) {
						for (int j = e; j <= s; j++) {
							if (corridor[j]) {
								flag = true;
								break;
							}
						}
						if (!flag) {
							for (int j = e; j <= s; j++) {
								corridor[j] = true;
							}
							q.poll();
							// System.out.println(start + " " + end);
						} else {
							q.offer(q.poll());
						}
					} else {
						for (int j = s; j <= e; j++) {
							if (corridor[j]) {
								flag = true;
								break;
							}
						}

						if (!flag) {
							for (int j = s; j <= e; j++) {
								corridor[j] = true;
							}
							q.poll();
//							System.out.println(start + " " + end);
						} else {
							q.offer(q.poll());
						}
					}
				}
				cnt++;

//				System.out.println(Arrays.toString(corridor));
//				Arrays.fill(corridor,false);
				for (int i = 0; i < corridor.length; i++)
					corridor[i] = false;

			} // end while
			System.out.printf("#%d %d\n", t, cnt);
		}
	}
}
