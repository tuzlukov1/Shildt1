package ShildtBook.chapter3.�����;

public class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;

        //���������� ���������� ����� �� 1 �� 5
        for (int i = 1; i <= 5; i++){
            sum += i;
            fact *= i;

        }

        //����� ��������� i ����������
        System.out.println("�����: " + sum);
        System.out.println("���������: "+ fact);
    }
}
