package algo;

/**
 * Created by Seokho Oh on 2017. 9. 3.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 */

public class SectionSumMax {
    public static void main(String[] args) {
        int max = 0;
        int sum = 0;
        int[] array = {-7, 4, -3, 6, 3, -8, 3, 4};
        for (int i = 0; i < 8; i++) {
            sum += array[i];
            sum = Math.max(0, sum);
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }
}
