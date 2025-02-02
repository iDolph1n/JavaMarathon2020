package day5;

public class Task1 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.print(Math.max(10, 100));
        }
        System.out.println();

        for (int i = 0; i < 100; i++) {
            System.out.print(Math.round(Math.random()*10) + " ");
        }
    }
}
