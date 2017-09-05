package algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Seokho Oh on 2017. 9. 5.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 * https://www.acmicpc.net/problem/2294
 */


public class CoinProblem2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int target = scanner.nextInt();
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            numList.add(scanner.nextInt());
        }
        int[] result = new int[target + 1];

        coinMakeSum(result, numList);

        if (result[target] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(result[target]);
        }

    }

    private static void coinMakeSum(int[] result, List<Integer> numList) {
        for (int i = 1; i < result.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int num : numList) {
                if (i - num >= 0) {
                    if (i - num == 0) {
                        min = 1;
                    } else if (result[i - num] != 0) {
                        min = Math.min(min, result[i - num] + 1);
                    }
                }
            }

            if (min == Integer.MAX_VALUE) {
                min = 0;
            }
            result[i] = min;

        }
    }

}
