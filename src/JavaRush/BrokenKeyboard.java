package JavaRush;

import java.util.Scanner;

/*
��������� ����������
*/

public class BrokenKeyboard {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String enterText = sc.nextLine();

        if(enterText.equalsIgnoreCase(enterText))
            //�������� ��� ��� ���
            System.out.println("������ ��������");
            //�������� ��� ��� ���
        else System.out.println("������ ��������");
    }
}

