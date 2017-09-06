package algo;

import java.util.*;

/**
 * Created by Seokho Oh on 2017. 9. 7.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 * http://ronniej.sfuh.tk/array-pair-sum/
 */


public class ArrayPairSum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int target = 5;
        Queue<Integer> list = new LinkedList<>();
        for(int num : array) {
            list.add(num);
        }

        for(int i = 0; i < list.size(); i++) {
            int temp = list.poll();
            if(list.contains(target - temp)) {
                System.out.println(temp + ", " + (target - temp));
            }
        }
    }

}
