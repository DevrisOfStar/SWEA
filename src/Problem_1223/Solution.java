package Problem_1223;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static int calculate(String s, int t) {
		int result = 0;
		int[] stack = new int[s.length()];
		int top = -1;
		stack[++top] = s.charAt(0) - '0';
		for (int i = 1; i < t; i = i + 2) {
			char op = s.charAt(i);
			int num = s.charAt(i + 1) - '0';
			if (op == '+') stack[++top] = num;
			else {
				int temp = stack[top--] * num;
				stack[++top] = temp;
			}
			
			
		}
		
		for(int i = 0; i<=top; i++)
			result+=stack[i];
		
		return result;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int t = 1; t <= 10; t++) {
			int k = Integer.parseInt(br.readLine());
			String s = br.readLine();
			System.out.printf("#%d %d\n", t, calculate(s, k));
		}
	}
}
