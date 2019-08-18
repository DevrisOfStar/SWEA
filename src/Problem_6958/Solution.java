package Problem_6958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			String temp = br.readLine();
			int N = Integer.parseInt(temp.split(" ")[0]);
			int M = Integer.parseInt(temp.split(" ")[1]);
			int a = 0; // 사람수
			int b = 0; // 정답수 
			for(int i = 0; i< N; i++) {
				temp = br.readLine();
				int tem = 0;
				for(int j = 0 ; j < M; j++) {
					if(temp.charAt(j*2) == '1') tem++;
				}
				if(b < tem) {
					b = tem;
					a = 1;
				}
				else if(b == tem) {
					a++;
				}
			}
			System.out.printf("#%d %d %d\n",t, a, b);
		}
	}
}
