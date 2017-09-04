package algo;

import java.util.Scanner;

/**
 * Created by Seokho Oh on 2017. 9. 4.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 * https://www.acmicpc.net/problem/9084
 */


public class CoinProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCount = scanner.nextInt();
        while (totalCount > 0) {
            int dp[] = new int[10001];
            dp[0] = 1;
            int typeCount = scanner.nextInt();
            for (int i = 0; i < typeCount; i++) {
                int x = scanner.nextInt();
                for (int j = x; j <= 10000; j++) {
                    dp[j] += dp[j - x];
                }
            }
            totalCount--;
            int money = scanner.nextInt();
            System.out.println(dp[money]);
        }
    }
}

