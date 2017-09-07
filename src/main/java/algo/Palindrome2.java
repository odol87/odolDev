package algo;

/**
 * Created by Seokho Oh on 2017. 9. 7.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 * https://www.acmicpc.net/problem/10942
 */


public class Palindrome2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 1, 2, 1};
        int[] input = {1, 3};
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = input[0] - 1; i < input[1]; i++) {
            stringBuilder.append(array[i]);
        }
        System.out.println(checkPalindrome(stringBuilder.toString()));

    }

    public static boolean checkPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s.toLowerCase());
        return s.toLowerCase().equals(stringBuilder.reverse().toString());
    }
}
