package algo;

import java.util.*;

/**
 * Created by Seokho Oh on 2017. 9. 6.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 * <p>
 * 문자열에서 반복되지 않는 첫번째 문자를 찾아내는 효율적인 함수를 작성하여라.
 */


public class FindFirstDupChar {
    public static void main(String[] args) {
        String input = "total";
        char[] array = input.toCharArray();
        Map<Character, Boolean> map = new LinkedHashMap();
        for(char c : array) {
            if(map.containsKey(c)) {
                map.put(c, true);
            } else {
                map.put(c, false);
            }
        }

        for(Map.Entry<Character, Boolean> i : map.entrySet()) {
            if(!i.getValue()) {
                System.out.println(i.getKey());
                break;
            }
        }

    }
}
