package algo;

/**
 * Created by Seokho Oh on 2017. 9. 5.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 */


public class Transfer {
    public static void main(String[] args) {
        int input = 16;
        System.out.println(transferHex(input));
        System.out.println(transferOcta(input));

    }

    public static String transferHex(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        while(num >= 16) {
            stringBuilder.append(calc(num%16));
            num /= 16;
        }
        stringBuilder.append(num);
        return stringBuilder.reverse().toString();
    }

    public static String transferOcta(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        while(num >= 8) {
            stringBuilder.append(calc(num%8));
            num /= 8;
        }
        stringBuilder.append(num);
        return stringBuilder.reverse().toString();
    }

    private static String calc(int num) {
        if(num >= 0 && num <= 9) {
            return String.valueOf(num);
        } else if (num >= 10 && num <= 15) {
            return String.valueOf('A' + (num - '0'));
        } else {
            throw new IllegalArgumentException("범위 초과");
        }
    }
}
