package Problem_6719;

import java.util.Arrays;
import java.util.Scanner;
 
public class Solution {
    public static double Solve(int N, int K, int[] score) { // 정렬 후 작은 것부터 계산.
        Arrays.sort(score); 
        double t = 0.0;
        for(int i = N-K; i < N; i++) { 
            t = (t + score[i]) / 2.0;
        }       
        return (double)t;
    }
     
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <= n; i++) {
            int N = sc.nextInt(); int K = sc.nextInt();
            int[] score = new int[N];
            for(int j = 0; j < N ; j++) {
                score[j] = sc.nextInt();
            }
            System.out.println("#" + i + " " +Solve(N,K,score));
        }
    }
}
