package JavaRush;


import java.util.Scanner;


public class ReadEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        if (a.equals(b))
            //�������� ��� ��� ���
            System.out.println("������ ����������");
            //�������� ��� ��� ���
        else System.out.println("������ ������");
    }
}

