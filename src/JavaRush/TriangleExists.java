package JavaRush;


import java.util.Scanner;

/*
�����������
*/

public class TriangleExists {
    private static final String TRIANGLE_EXISTS = "����������� ����������";
    private static final String TRIANGLE_NOT_EXISTS = "����������� �� ����������";

    public static void main(String[] args) {
        //�������� ��� ��� ���
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a < (b + c)) && (b < (a + c)) && (c < (a + b)))
            System.out.println(TRIANGLE_EXISTS);
        else System.out.println(TRIANGLE_NOT_EXISTS);
    }
}

