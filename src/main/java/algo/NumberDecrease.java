package algo;

/**
 * Created by Seokho Oh on 2017. 9. 7.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 * N이 들어오면 N, N-1 …. 1이 첫 줄에 출력되고 그 다음 줄에는 N, N-1, …2 이런식으로 그리고 마지막에는 N이 출력.
 * 만약 N이 11이라면
 * 1110987654321
 * 111098765432
 * 11109876543
 * …
 * 11
 */


public class NumberDecrease {
    public static void main(String[] args) {
        int num = 11;
        for (int i = num; i > 0; i--) {
            int temp = num;
            for (int j = 0; j < i; j++) {
                System.out.print(temp--);
            }
            System.out.println();
        }
    }
}
