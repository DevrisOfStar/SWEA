package Problem_2948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		for (int t = 1; t <= T; t++) {
			String temp = br.readLine();
			int a = Integer.parseInt(temp.split(" ")[0]);
			int b = Integer.parseInt(temp.split(" ")[1]);
			
			temp = br.readLine().trim();
			for(String s : temp.split(" "))
				set.add(s);
			
			temp = br.readLine().trim();
			for(String s : temp.split(" "))
				set.add(s);
			
			int c = set.size();
			System.out.printf("#%d %d\n", t, a+b - c);
			set.clear();
		}
	}
}
