package Problem_1213;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int t = 1; t <=10; t++) {
			String s = br.readLine();
			String t1 = br.readLine();
			s = br.readLine();
			s += " "; // 마지막 문자열을 처리하기 위한 공백문자 추가
			System.out.printf("#%d %d\n", t, s.split(t1).length-1);
		}
	}
}
