package sort;

/**
 * Created by Seokho Oh on 2017. 9. 6.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 */


public class QuickSort {

    public static void main(String[] args) {
        int[] array = {3, 2, 1, 4, 5, 1};
        sort(array, 0, array.length - 1);
        for (int a : array) {
            System.out.println(a);
        }
    }

    public static void sort(int[] array, int front, int end) {
        if (front >= end) {
            return;
        }
        int pivot = array[front];
        int left = front + 1;
        int right = end;
        while (left <= right) {
            if (array[left] > pivot && array[right] < pivot) {
                swap(array, left++, right--);
            }
            if (array[left] <= pivot) {
                left++;
            }
            if (array[right] >= pivot) {
                right--;
            }
        }
        swap(array, right, front);
        sort(array, front, right - 1);
        sort(array, right + 1, end);
    }

    public static void swap(int[] array, int front, int end) {
        int temp = array[front];
        array[front] = array[end];
        array[end] = temp;
    }
}
