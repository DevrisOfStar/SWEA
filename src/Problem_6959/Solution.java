package Problem_6959;

import java.util.Scanner;

public class Solution {
 
    public static String Solve(String N) {
        int num = Integer.parseInt(String.valueOf(N.charAt(0)));
        int count = 0;
        for (int i = 1; i < N.length(); i++) {
            num += Integer.parseInt(String.valueOf(N.charAt(i)));
            count++;
            if (num > 9) {
                num = (num / 10) + (num % 10);
                count++;
            }
        }
 
        return count%2 == 0 ? "B" : "A";
    }
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            String N = sc.next();
 
            System.out.println("#" + i + " " + Solve(N));
        }
    }
}