package JavaRush;

import java.util.Scanner;

/*
����� ��� �������
*/

public class Temp {
    public static void main(String[] args) {
        String cold = "�� ����� �������";
        String warm = "�� ����� �����";
        //�������� ��� ��� ���
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if(temp<0)
            System.out.println("�� ����� �������");
        else
            System.out.println("�� ����� �����");
    }
}
