package algo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Seokho Oh on 2017. 9. 8.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 */


public class FindPosition {
    public static void main(String[] args) {
        int[][] v = {{1, 4}, {3, 4}, {3, 10}};
        int[] result = solution(v);
        for(int a : result) {
            System.out.println(a);
        }

    }

    public static int[] solution(int[][] v) {
        int[] result = new int[2];
        Map<Integer, Boolean> resultX = new HashMap<>();
        Map<Integer, Boolean> resultY = new HashMap<>();


        for (int i = 0; i < v.length; i++) {
            if (!resultX.containsKey(v[i][0])) {
                resultX.put(v[i][0], true);
            } else {
                resultX.put(v[i][0], false);
            }

            if (!resultY.containsKey(v[i][1])) {
                resultY.put(v[i][1], true);
            } else {
                resultY.put(v[i][1], false);

            }
        }

        for (Map.Entry<Integer, Boolean> entry : resultX.entrySet()) {
            if(entry.getValue()) {
                result[0] = entry.getKey();
            }
        }

        for (Map.Entry<Integer, Boolean> entry : resultY.entrySet()) {
            if(entry.getValue()) {
                result[1] = entry.getKey();
            }
        }

        return result;
    }
}
