package sort;

/**
 * Created by Seokho Oh on 2017. 9. 3.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 */


public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 2, 4};
        int index = 0;

        for(int i = 0; i < array.length; i++) {
            int min = array[i];
            for(int j = i; j < array.length; j++) {
                if(min > array[j]) {
                    min = array[j];
                    index = j;
                }
            }

            if(min < array[i]) {
                int temp = array[i];
                array[i] = min;
                array[index] = temp;
            }

        }
        for(int a : array) {
            System.out.println(a);
        }
    }


}
