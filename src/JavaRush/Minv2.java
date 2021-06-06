package JavaRush;

import java.util.Scanner;

public class Minv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while(sc.hasNextInt()) {
            int c = sc.nextInt();
            if (c<min) min = c;
            continue;
        }
        System.out.println(min);
    }
}
