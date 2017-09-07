package algo;


import java.util.Arrays;
import java.util.List;

/**
 * Created by Seokho Oh on 2017. 9. 7.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 */


public class Palindrome {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Anna", "Harrah", "Nat tan", "Palindrome", "123454321", "Dogs and Cats", "**()()**", "1 221");
        for(String s : list) {
            System.out.println(checkPalindrome(s));
        }
    }

    public static boolean checkPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s.toLowerCase());
        return s.toLowerCase().equals(stringBuilder.reverse().toString());
    }
}
