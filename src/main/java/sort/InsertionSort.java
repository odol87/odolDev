package sort;

/**
 * Created by Seokho Oh on 2017. 9. 3.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 */

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {6, 5, 1, 3, 2, 4};
        int j;

        for (int i = 1; i < array.length; i++) {

            int temp = array[i];

            for (j = i - 1; j >= 0; j--) {
                if (array[j] < temp) {
                    break;
                }
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }

        for (int a : array) {
            System.out.println(a);
        }
    }
}
