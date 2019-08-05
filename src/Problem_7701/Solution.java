package Problem_7701;
/* 50/50 시간초과 뜸, 시간줄일수 있는 부분 찾아보기 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t<=T;t++) {
			int N = Integer.parseInt(br.readLine());
			List<String> str = new ArrayList<>();
			for(int i = 0; i <N;i++) {
				String s = br.readLine();
				if(!str.contains(s))
					str.add(s);
			}
			
			str.sort(new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					if(o1.length() == o2.length()) {
						return o1.compareTo(o2);
					}
					
					return o1.length() > o2.length() ? 1 : -1;
				}
			});
			
			StringBuilder sb = new StringBuilder();
			sb.append("#").append(t).append('\n');
			for(String s : str) {
				sb.append(s).append('\n');
			}
			System.out.println(sb.toString());
		}
		
	}
}
