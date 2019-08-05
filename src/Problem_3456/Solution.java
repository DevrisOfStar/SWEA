package Problem_3456;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <=T; t++) {
			String[] str = br.readLine().trim().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int c = Integer.parseInt(str[2]);
			int comp = 0;
			if(a==b) comp=c;
			else if(b==c) comp=a;
			else comp=b;
			
			System.out.printf("#%d %d\n", t, comp);
			
			
		}
	}
}
