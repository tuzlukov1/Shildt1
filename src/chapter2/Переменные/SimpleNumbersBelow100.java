package chapter2.����������;
//���������� ������� ����� � ��������� �� 2 �� 100
public class SimpleNumbersBelow100 {
    public static void main(String[] args) {
    int i, j;
    boolean isPrime;

    for (i = 2; i < 100; i++){
        isPrime = true;

        //��������� ������� �� ����� ��� �������
        for (j = 2; j <= i/j; j++)
            //���� ����� ������� ��� ������� ������ ��� �� �������
            if ((i%j) == 0) isPrime = false;

            if(isPrime)
                System.out.println(i + " - ������� �����");


    }


    }
}

