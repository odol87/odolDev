package algo;

/**
 * Created by Seokho Oh on 2017. 9. 7.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 */


public class RemoveString {
    public static void main(String[] args) {
        String input = "i havehave aoao a car hahao";
        String word = "have";

        char[] inputArray = input.toCharArray();
        StringBuilder result = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder();
        for(char c : inputArray) {
            stringBuilder.append(c);

            if(stringBuilder.length() == word.length()) {
                if(word.equals(stringBuilder.toString())) {
                    stringBuilder.delete(0, stringBuilder.length());
                } else {
                    result.append(stringBuilder);
                    stringBuilder.delete(0, stringBuilder.length());
                }
            } else if (c == ' ') {
                result.append(stringBuilder);
                stringBuilder.delete(0, stringBuilder.length());
            }
        }

        System.out.println(result.toString());

    }
}
