package Problem_6692;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String temp;
		double a, b, answer;
		for(int t = 1; t <=T; t++) {
			int N = Integer.parseInt(br.readLine());
			answer = 0.0;
			for(int i = 0; i < N; i++) {
				temp = br.readLine();
				a = Double.parseDouble(temp.split(" ")[0]);
				b = Double.parseDouble(temp.split(" ")[1]);
				
				answer += (a*b);
			}
			System.out.printf("#%d %f\n",t, answer);
		}
	}
}
