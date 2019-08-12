package Problem_1233;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp;
		int f, k, a;
		for (int t = 1; t <= 10; t++) {
			f = 1;
			k = Integer.parseInt(br.readLine());
			
			for(int i = 0 ; i < k; i++) {
				 temp = br.readLine().split(" ");
				 a = temp[1].charAt(0)-'0';
				 // - 면 기호, 0,+ 면 숫자
				 if(temp.length == 4 && a >= 0) f = 0;

				 else if(temp.length == 2 && a < 0)  f = 0;	 
			}
			
			System.out.printf("#%d %d\n",t,f);
		}

	}
}
