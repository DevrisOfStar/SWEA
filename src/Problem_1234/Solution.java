package Problem_1234;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int t = 1; t <= 10; t++) {
			String[] str = br.readLine().split(" ");
			int cnt = Integer.parseInt(str[0]);
			char[] chars = str[1].toCharArray();
			char[] stack = new char[chars.length];
			int top = -1;
			for (int i = 0; i < cnt; i++) {
				if (top != -1 && stack[top] == chars[i]) {
					char temp = stack[top--];
				} else {
					stack[++top] = chars[i];
				}
			}

			System.out.printf("#%d ", t);
			for (int i = 0; i <= top; i++) {
				System.out.printf("%c", stack[i]);
			}
			System.out.println();

		}

	}
}
