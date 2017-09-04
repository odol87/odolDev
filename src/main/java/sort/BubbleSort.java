package sort;

/**
 * Created by Seokho Oh on 2017. 9. 3.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 2, 4};
        for (int i = array.length; i >= 0; i--) {
            for (int j = 1; j < i; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        for(int a : array) {
            System.out.println(a);
        }
    }
}
