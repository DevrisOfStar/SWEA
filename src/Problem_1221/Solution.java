package Problem_1221;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//not sovled.
public class Solution {
	static int[] cnt = {0,0,0,0,0,0,0,0,0,0}; // 0 ~ 9
	static String[] num = {"ZRO", "ONE", "TWO","THR", "FOR","FIV", "SIX", "SVN", "EGT", "NIN"};
	public static void solution(String[] str) {
		for(String s: str) {
			switch(s) {
			case "ZRO":
				cnt[0]++;
				break;
			case "ONE":
				cnt[1]++;
				break;
			case "TWO":
				cnt[2]++;
				break;
			case "THR":
				cnt[3]++;
				break;
			case "FOR":
				cnt[4]++;
				break;
			case "FIV":
				cnt[5]++;
				break;
			case "SIX":
				cnt[6]++;
				break;
			case "SVN":
				cnt[7]++;
				break;
			case "EGT":
				cnt[8]++;
				break;
			case "NIN":
				cnt[9]++;
				break;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j<cnt[i] ; j++) {
				sb.append(num[i]).append(" ");
			}
		}
		System.out.println(sb.toString().trim());
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			String k = br.readLine();
			String temp = br.readLine();
			System.out.printf("#%d\n", t);
			for(int i= 0 ; i< 10; i++) cnt[i] = 0;
			solution(temp.split(" "));
		}

	}

}
