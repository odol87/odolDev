package algo;

/**
 * Created by Seokho Oh on 2017. 9. 4.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 */


public class CompressString {
    public static void main(String[] args) {
        String input = "aabbbcccc";
        char[] array = input.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        char temp = array[0];
        int count = 0;

        for(char c : array) {
            if(temp == c) {
                count++;
            } else {
                stringBuilder.append(temp).append(count);
                count = 1;
                temp = c;
            }
        }
        stringBuilder.append(temp).append(count);

        System.out.println(stringBuilder.toString());
    }
}
