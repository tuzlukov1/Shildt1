package JavaRush;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);  // ������� ������ Scanner
        int a = console.nextInt();  // ������ � ���������� ������ �����
        int b = console.nextInt();  // ������ � ���������� ������ �����
        if (a < b)                   // ���� a ������ b
            System.out.println(a);     // ������� �� ����� a
        else                         // �����
            System.out.println(b);     // ������� �� ����� b
    }
}
