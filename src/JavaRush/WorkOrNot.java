package JavaRush;

import java.util.Scanner;

/*
�������� ��� �� �������� - ��� � ��� ������
*/
public class WorkOrNot {


    public static void main(String[] args) {
        //�������� ��� ��� ���
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if ((age > 60) || (age < 20))
            System.out.println("����� �� ��������");
    }
}


