package Problem_1225;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Solution {
    public static void solution(String[] str) {
        int[] arr = new int[8];
 
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int c = 0;
        do {
         
        arr[0] -= (c%5+1);
        c++;
        int temp = arr[0];
        for(int i = 1; i < 8;i++) {
            arr[i-1] = arr[i];
        }
        arr[7] = temp;
         
        if(arr[7] <= 0) arr[7] = 0;
         
        } while(arr[7]!=0);
         
        for(int i = 0; i<8;i++) {
            System.out.printf(arr[i] + " ");
        }
        System.out.println();
 
    }
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = 1; t <= 10; t++) {
            int T = Integer.parseInt(br.readLine());
            String temp = br.readLine().trim();
            System.out.printf("#%d ", t);
            solution(temp.split(" "));
        }
 
    }
 
}
