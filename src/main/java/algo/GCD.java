package algo;

/**
 * Created by Seokho Oh on 2017. 9. 4.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 * 참고 url (유클리드 호제법)
 * https://ko.wikipedia.org/wiki/%EC%9C%A0%ED%81%B4%EB%A6%AC%EB%93%9C_%ED%98%B8%EC%A0%9C%EB%B2%95
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
