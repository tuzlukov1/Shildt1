package JavaRush;

import java.util.Scanner;

/*
����� ��� ��������
*/

public class School {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18)
        {
            if (age >= 6)
                System.out.println("����� ������ � �����");
        }
        else
            System.out.println("���� � ��������");
    }
}
