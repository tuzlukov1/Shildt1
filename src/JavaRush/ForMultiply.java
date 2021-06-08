package JavaRush;

import java.util.Scanner;

public class ForMultiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0;
        //напишите тут ваш код
        for (; start < end; start++)
            if (start % multiple == 0) sum += start;
            else continue;

        System.out.println(sum);
    }
}
