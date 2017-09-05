package algo;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Seokho Oh on 2017. 9. 5.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 */


public class Permutation {

    public static Set set;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        set = new TreeSet();
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        permutation(array, 0, size, size);

        set.forEach(v -> printSet((int)v));

    }

    public static void printSet(int v) {
        char[] array = String.valueOf(v).toCharArray();
        for(char a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void print(int[] array) {
        int temp = 0;
        int j = 0;
        for(int i = array.length-1; i >= 0; i--, j++) {
            temp += array[j] * Math.pow(10, i);
        }
        set.add(temp);
//        for (int a : array) {
//            System.out.print(a + " ");
//        }
//        System.out.println();
    }

    public static void swap(int[] array, int from, int to) {
        int temp = array[from];
        array[from] = array[to];
        array[to] = temp;
    }

    public static void permutation(int[] array, int depth, int n, int k) {

        if (depth == k) {
            print(array);
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(array, i, depth);
            permutation(array, depth + 1, n, k);
            swap(array, i, depth);
        }

    }


}
