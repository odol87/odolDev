package algo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Seokho Oh on 2017. 9. 8.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 */


public class Hopscotch {


    public static void main(String[] args) {
        int[][] input = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};
//        System.out.println(solution(input));
        System.out.println(dynamicSolution(input));
    }

    public static int dynamicSolution(int[][] land) {
        int answer = 0;
        for(int i = 1; i < land.length; i++) {
            for(int j = 0; j < land[i].length; j++) {
                int temp = land[i][j];
                for(int k = 0; k < land[i].length; k++) {
                    if(k == j) {
                        continue;
                    }
                    land[i][j] = Math.max(land[i - 1][k] + temp, land[i][j]);
                    answer = Math.max(answer, land[i][j]);
                }
            }
        }
        return answer;
    }


    public static int solution(int[][] land) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int lastIndex = -1;
        for (int i = 0; i < land.length; i++) {
            int[] result = returnMax(land[i], lastIndex);
            lastIndex = result[1];
            map.put(i, result[0]);
        }
        for (int i = 0; i < land.length; i++) {
            answer += map.get(i);
        }
        return answer;
    }



    public static int[] returnMax(int[] array, int withOutIndex) {
        int[] result = new int[2];
        result[0] = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != withOutIndex) {
                if (result[0] < array[i]) {
                    result[0] = array[i];
                    result[1] = i;
                }
            }
        }

        return result;
    }
}
