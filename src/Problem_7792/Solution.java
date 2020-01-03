package Problem_7792;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class NameCounter implements Comparable<NameCounter>{
	String name;
	int count;
	boolean[] ch;
	public NameCounter(String name) {
		this.name = name;
		ch = new boolean[26];
		for(int i = 0; i < name.length();i++) {
			if(name.charAt(i) == ' ') continue;
			ch[name.charAt(i)-'A'] = true;
		}
		for(int i = 0; i < ch.length; i++) if(ch[i]) count++;
	}
	@Override
	public int compareTo(NameCounter o) {
		if(this.count < o.count)
			return 1;
		else if (this.count > o.count){
			return -1;
		}
		else {
			return this.name.compareTo(o.name);
		}
	}
	
	
}

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int c;
		StringBuilder sb = new StringBuilder();
		ArrayList<NameCounter> arr = new ArrayList<>();
		for(int t = 1; t <= T; t++) {
			sb.append("#").append(t).append(" ");
			c = Integer.parseInt(br.readLine());
			for(int i = 0; i < c; i++)
				arr.add(new NameCounter(br.readLine()));
			arr.sort(null);
			sb.append(arr.get(0).name).append("\n");
			arr.clear();
		}
		System.out.print(sb.toString());
		
	}
}
