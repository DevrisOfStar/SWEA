package Problem_8658;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int min, max;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int number = 0;
		StringBuilder sb = new StringBuilder();
		for(int t = 1 ; t<=T;t++) {
			sb.append("#").append(t).append(" ");
			min = Integer.MAX_VALUE; max = Integer.MIN_VALUE;
			String[] str = br.readLine().split(" ");
			for(int i = 0 ; i<str.length; i++) {
				number = 0;
				for(int j = 0; j<str[i].length();j++) {
					number += str[i].charAt(j) -'0';
				}
				if(number < min) min = number;
				if(number > max) max = number;
			}
			
			sb.append(max).append(" ").append(min).append("\n");
		}
		
		System.out.print(sb.toString());
	}
}
