package JavaRush;

import java.util.Scanner;

public class Ternar1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = "" + number;
        if (number < 5)
            System.out.println("����� ������ 5");
        else if (number > 5){
            System.out.println("����� ������ 5");
        }
        else System.out.println("����� ����� 5");
    }
}
