package Problem_4261;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static int hash(char c) {
		switch (c) {
			case 'a':
			case 'b':
			case 'c':
				return 2;
			case 'd':
			case 'e':
			case 'f':
				return 3;
			case 'g':
			case 'h':
			case 'i':
				return 4;
			case 'j':
			case 'k':
			case 'l':
				return 5;
			case 'm':
			case 'n':
			case 'o':
				return 6;
			case 'p':
			case 'q':
			case 'r':
			case 's':
				return 7;
			case 't':
			case 'u':
			case 'v':
				return 8;
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				return 9;
		}
		return -1;
	}

	public static String getV(String Voca) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < Voca.length(); i++) {
			sb.append(hash(Voca.charAt(i)));
		}
		return sb.toString();
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int cnt;
		int n;
		String str;
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int t = 1; t <= T; t++) {
			sb.append("#").append(t).append(" ");
			cnt = 0;
			str = br.readLine();
			st = new StringTokenizer(br.readLine()," ");
			n = Integer.parseInt(str.split(" ")[1]);
			str = str.split(" ")[0];
			
			for(int i = 0 ; i < n; i++) {
				if(getV(st.nextToken()).equals(str)) cnt++;
			}
			sb.append(cnt).append("\n");
		}
		
		System.out.print(sb.toString());

	}
}
