package algo;


/**
 * Created by Seokho Oh on 2017. 9. 3.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 */

/*
https://www.acmicpc.net/problem/1003
 */

import java.util.Scanner;

public class Fibonacci {
    private int count;
    static int zero = 0;
    static int one = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeat = scanner.nextInt();
        if (40 >= repeat || repeat >= 0) {
            int[] array = new int[repeat];
            while (repeat > 0) {
                repeat--;
                array[repeat] = scanner.nextInt();
            }

            for (int i = array.length - 1; i >= 0; i--) {
                fibonacci(array[i]);
                System.out.println(zero + " " + one);
                zero = 0;
                one = 0;
            }
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            zero++;
            return 0;
        } else if (n == 1) {
            one++;
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public Fibonacci(int count) {
        this.count = count;
    }


    public void printFiboFor() {
        int front = 1;
        int rear = 1;
        for (int i = 2; i <= count; i++) {
            int temp = rear;
            rear += front;
            front = temp;
        }
        System.out.println(rear);
    }

    public int printFiboRec(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1 || num == 2) {
            return 1;
        } else {
            return printFiboRec(num - 1) + printFiboRec(num - 2);
        }
    }
}
