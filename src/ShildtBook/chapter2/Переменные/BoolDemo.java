package ShildtBook.chapter2.����������;

public class BoolDemo {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("�������� b: " + b);
        b = true;
        System.out.println("�������� b: " + b);

        //���������� �������� ����� ������������ ��� ���������� �������� ����������� if
        if(b) System.out.println("��� ���������� �����������");
        b = false;

        if(b) System.out.println("��� ���������� �� �����������");

        // � ���-�� ��������� ���������� ���������� ��������
        System.out.println("���-� ��������� 10>9 : " + (10>9));
    }
}
