package JavaRush;

import java.util.Scanner;

public class Summator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(sc.hasNextInt()) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
        sc.close();
    }
}
