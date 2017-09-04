package dataStructure;

/**
 * Created by Seokho Oh on 2017. 9. 4.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 */


public class MultiArrayQueue {
    public static void main(String[] args) {
        String[] input = {"a", "b", "c", "d", "e", "f", "g", "h"};
        String[] arr1 = new String[3];
        String[] arr2 = new String[3];
        String[] arr3 = new String[3];

        int count = 0;

        for (int i = 0; i < input.length; i++) {
            if(arr1[count] == null) {
                arr1[count] = input[i];
            } else if (arr2[count] == null) {
                arr2[count] = input[i];
            } else {
                arr3[count] = input[i];
                count++;
            }
        }

        System.out.println("arr1 : ");
        for (String s : arr1 ) {
            System.out.println(s);
        }
        System.out.println("arr2 : ");
        for (String s : arr2 ) {
            System.out.println(s);
        }
        System.out.println("arr3 : ");
        for (String s : arr3 ) {
            System.out.println(s);
        }
    }
}
