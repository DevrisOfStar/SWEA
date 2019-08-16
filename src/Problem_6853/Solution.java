package Problem_6853;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String temp;
		int a,b,c;
		for (int t = 1; t <= T; t++) {
			temp = br.readLine();
			int x1 = Integer.parseInt(temp.split(" ")[0]);
			int y1 = Integer.parseInt(temp.split(" ")[1]);
			int x2 = Integer.parseInt(temp.split(" ")[2]);
			int y2 = Integer.parseInt(temp.split(" ")[3]);
			a = 0; b = 0; c =0;
			int N = Integer.parseInt(br.readLine());
			for(int i = 0; i < N; i++) {
				temp = br.readLine();
				int x = Integer.parseInt(temp.split(" ")[0]);
				int y = Integer.parseInt(temp.split(" ")[1]);
				
				if(x1 < x && x2 > x && y1< y && y2 > y) {
					a++;
				}
				else if(x1 > x || x2 < x || y1 > y || y2 < y) {
					c++;
				}
				else {
					b++;
				}
				
			}
			System.out.printf("#%d %d %d %d\n",t,a,b,c);
			
		}
	}
}
