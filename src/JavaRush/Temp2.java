package JavaRush;

import java.util.Scanner;

public class Temp2 {
    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();

        isHigh = bodyTemperature > 37;
        isLow = bodyTemperature < 36;


        //�������� ��� ��� ���
        if (isHigh) {
            System.out.println("����������� ���� �������");
        } else if (isLow) {
            System.out.println("����������� ���� ������");
        } else {
            System.out.println("����������� ���� ����������");
        }
    }
}
