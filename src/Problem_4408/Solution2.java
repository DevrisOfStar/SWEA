package Problem_4408;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution2 {
	static int[] corridor = new int[200]; // (a-1)/2 - 복도

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		int N;
		StringTokenizer st;
		for (int t = 1; t <= T; t++) {
			N = Integer.parseInt(br.readLine().trim());
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				int start = Integer.parseInt(st.nextToken());
				int end = Integer.parseInt(st.nextToken());

				start= (start-1)/2;
				end = (end-1)/2;
				
				if (start < end) {
					for (int i = start; i <= end; i++)
						corridor[i]++;
				}

				else {
					for (int i = end; i <= start; i++)
						corridor[i]++;
				}

			} // end while
			System.out.println(Arrays.toString(corridor));
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < corridor.length; i++)
				if (max < corridor[i])
					max = corridor[i];
			
			Arrays.fill(corridor, 0);
			System.out.printf("#%d %d\n", t, max);
		}
	}
}
