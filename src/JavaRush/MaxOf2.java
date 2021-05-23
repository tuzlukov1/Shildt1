package JavaRush;

import java.util.Scanner;

public class MaxOf2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        System.out.println(numberA > numberB ? numberA : numberB);
    }
}

