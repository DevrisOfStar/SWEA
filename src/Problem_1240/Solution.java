package Problem_1240;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	static String[] numbers = { "0001101", // 0
			"0011001", // 1
			"0010011", // 2
			"0111101", // 3
			"0100011", // 4
			"0110001", // 5
			"0101111", // 6
			"0111011", // 7
			"0110111", // 8
			"0001011" // 9
	};

	public static int solution(String code) {
		int idx = 0;
		for (int i = 0; i < code.length(); i++) {
			if (code.charAt(i) - '0' == 1)
				idx = i + 1;
		}

		String ps = code.substring(idx - 56, idx);
		String sub;
		int valid = 0;
		int valid_odd = 0;
		int sum = 0;
		for (int i = 0; i < 8; i++) {
			sub = ps.substring(i * 7, (i + 1) * 7);
			for (int j = 0; j < 10; j++) {
				if (numbers[j].equals(sub)) {

					sum += j;
					if (i % 2 == 0) {
						valid_odd += j;
					} else {
						valid += j;
					}

				}
			}
		}
		valid += (valid_odd*3);
		sub = ps.substring(48, 56);
		for (int j = 0; j < 10; j++) {
			if (numbers[j].equals(sub)) {
				sum += j;
				valid += j;
			}
		}
		
		return (valid % 10 == 0) ? sum : 0;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String temp = null;
		String code = null;
		for (int t = 1; t <= T; t++) {
			temp = br.readLine().trim();
			int a = Integer.parseInt(temp.split(" ")[0]);
			int b = Integer.parseInt(temp.split(" ")[1]);

			for (int i = 0; i < a; i++) {
				temp = br.readLine();
				if (temp.contains("1")) {
					code = temp;
				}
			}

			System.out.printf("#%d %d\n", t, solution(code));
		}
	}
}
