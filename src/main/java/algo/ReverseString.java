package algo;

/**
 * Created by Seokho Oh on 2017. 9. 4.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 */


public class ReverseString {
    public static void main(String[] args) {
        String input = "abcde";
        char[] array = input.toCharArray();
        for(int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for(char c : array) {
            System.out.print(c);
        }
    }
}
