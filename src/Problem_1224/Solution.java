package Problem_1224;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	public static int calculate(String s, int t) {
		char[] stackOp = new char[100];
		char[] temp = new char[t];
		int top = -1;
		int cnt = 0;
		for (int i = 0; i < t; i++) {
			char c = s.charAt(i);
			switch (c) {
			case '+':
				while (top >= 0 && stackOp[top]!='(') {
					temp[cnt++] = stackOp[top--];
				}
				stackOp[++top] = c;
				break;
			case '*':
				while (top >= 0 && stackOp[top]=='*') {
					temp[cnt++] = stackOp[top--];
				}
				stackOp[++top] = c;
				break;
			case '(':
				stackOp[++top] = c;
				break;
			case ')':
				while (top >= 0 && stackOp[top]!='(') {
					temp[cnt++] = stackOp[top--];
				}
				char a = stackOp[top--];
				break;
			default:
				temp[cnt++] = c;
				break;
			}
		}
		
		for(int i = 0; i <= top; i++) {
			temp[cnt++] = stackOp[i];
		}
		int[] num_stack = new int[temp.length];
		top = -1;
		
		for(int i = 0; i<cnt;i++) {
			char c = temp[i];
			switch (c) {
			case '+':
				int num2 = num_stack[top--];
				int num1 = num_stack[top--];
				num_stack[++top] = num1 + num2;
				break;

			case '*':
				num2 = num_stack[top--];
				num1 = num_stack[top--];
				num_stack[++top] = num1 * num2;
				break;

			default:
				num_stack[++top] = c-'0';
				break;
			}
		}
		return num_stack[0];
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int t = 1; t <= 10; t++) {
			int k = Integer.parseInt(br.readLine());
			String s = br.readLine();
			System.out.printf("#%d %d\n", t, calculate(s,k));
		}
	}
}
