package Problem_7193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		String str = null;
		int answer;
		for (int t = 1; t <= T; t++) {
			answer = 0;
			st = new StringTokenizer(br.readLine()," ");
			int N = Integer.parseInt(st.nextToken());
			int M = N-1;
			str = st.nextToken();
			for(int i = 0 ; i < str.length(); i++) {
				answer = (answer * N + (str.charAt(i)-'0')) % M;
			}
			System.out.printf("#%d %d\n", t, answer);
		}

	}
}
