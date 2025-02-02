package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int[] count = new int[scanner.nextInt()];
        scanner.close();

        for (int i = 0; i < count.length; i++)
            count[i] += rand.nextInt(10);

        System.out.println(Arrays.toString(count));
        System.out.println(count.length);

        int counter8 = 0;

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 8)
                counter8++;
        }
        System.out.println(counter8);

        int counter1 = 0;

        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1)
                counter1++;
        }
        System.out.println(counter1);

        int chet = 0;

        for (int i = 0; i < count.length; i++) {
            if (count[i] % 2 == 0)
                chet++;
        }
        System.out.println(chet);

        int nechet = 0;

        for (int i = 0; i < count.length; i++) {
            if (count[i] % 2 != 0)
                nechet++;
        }
        System.out.println(nechet);

        int sum = 0;

        for (int i = 0; i < count.length; i++) {
            sum += count[i];
        }
        System.out.println(sum);
    }
}