package algo;

/**
 * Created by Seokho Oh on 2017. 9. 4.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 */


public class LCM {

    public int getLCM(int a, int b) {
        GCD gcd = new GCD();
        return (a * b) / (gcd.getGCD(a, b));

    }

    public static void main(String[] args) {
        LCM lcm = new LCM();
        System.out.println(lcm.getLCM(7, 5));
    }
}
