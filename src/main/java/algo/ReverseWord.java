package algo;

/**
 * Created by Seokho Oh on 2017. 9. 7.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 */


public class ReverseWord {
    public static void main(String[] args) {
        String input = "i am a    boy";
        System.out.println(reverseWord(input));

    }

    public static String reverseWord(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] array = input.split(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            if(!array[i].isEmpty()) {
                stringBuilder.append(array[i]).append(" ");
            }
        }
        return stringBuilder.toString();
    }

}
