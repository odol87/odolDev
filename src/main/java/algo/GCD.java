package algo;

/**
 * Created by Seokho Oh on 2017. 9. 4.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 */


public class GCD {
    public static void main(String[] args) {
        GCD gcd = new GCD();
        System.out.println(gcd.getGCD(5, 7));
    }

    public int getGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return Math.abs(a);
    }
}
