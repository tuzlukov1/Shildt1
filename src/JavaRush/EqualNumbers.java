package JavaRush;

import java.util.Scanner;

/*
Три числа
*/

public class EqualNumbers {
    public static void main(String[] args) {
        //напишите тут ваш код

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a == b) && (b == c) && (a == c))
            System.out.println(a + " " + b + " " + c);

        else if (a == b)
            System.out.println(a + " " + b);

        else if (b == c)
            System.out.println(b + " " + c);

        else if (a == c)
            System.out.println(a + " " + c);

    }
}
