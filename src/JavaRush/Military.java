package JavaRush;

import java.util.Scanner;

public class Military {

/*
��������� ��������
*/

    public static void main(String[] args) {
        String militaryCommissar = ", ������� � ���������";
        //�������� ��� ��� ���
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = sc.nextInt();

        if ((age >= 18) && (age <= 28))
            System.out.println(name + militaryCommissar);
    }
}

