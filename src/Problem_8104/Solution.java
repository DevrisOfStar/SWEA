package Problem_8104;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* 메모리 오류가 뜸 : 조정 필요 */
public class Solution {

	public static void solution(long n, long k) {
		long num = 0;
		if (n % 2 == 0) {
			num = n / 2;
			num = 2 * k * num * num + num;
		} else {
			num = (n + 1) / 2;
			num = 2 * k * num * (num - 1) + num;
		}
		
		
		for(int i = 0; i < k; i++)
			System.out.print(num + " ");
		System.out.println();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			String[] str = br.readLine().split(" ");

			solution(Long.parseLong(str[0]), Long.parseLong(str[1]));
		}
	}
}
