package Problem_1220;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	static int[][] arr = new int[100][100];
	static int answer;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		for (int t = 1; t <= 10; t++) {
			str = br.readLine();
			answer = 0;
			for (int i = 0; i < 100; i++) {
				str = br.readLine();
				for (int j = 0; j < 100; j++) {
					arr[i][j] = str.charAt(j * 2) - '0';
				}
			}

			for (int j = 0; j < 100; j++) {
				for (int i = 0; i < 100; i++) {
					if (arr[i][j] == 2) {
						arr[i][j] = 0;
					} else if (arr[i][j] == 1) {
						break;
					}
				}
			}

			for (int j = 0; j < 100; j++) {
				for (int i = 99; i >= 0; i--) {
					if (arr[i][j] == 1) {
						arr[i][j] = 0;
					} else if (arr[i][j] == 2) {
						break;
					}
				}
			}

			for (int j = 0; j < 100; j++) {
				int flag = 0;
				for (int i = 0; i < 100; i++) {
					if(arr[i][j] == 1) {
						flag = 1;
					}
					else if(arr[i][j] == 2) {
						if(flag == 1) {
							flag = 0; answer++;
						}
					}
				}
			}

			System.out.printf("#%d %d\n", t, answer);

		}
	}
}
