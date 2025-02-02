package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int max = 0;
        int min = 10000;

        for (int Array : array) {
            if (Array > max)
                max = Array;
        }
        System.out.println(max);

        for (int Array : array) {
            if (Array < min)
                min = Array;
        }
        System.out.println(min);

        int count = 0;

        for (int Array : array) {
            if (Array % 10 == 0)
                count++;
        }
        System.out.println(count);

        int sum = 0;

        for (int Array : array) {
            if (Array % 10 == 0)
                sum += Array;
        }
        System.out.println(sum);
    }
}
