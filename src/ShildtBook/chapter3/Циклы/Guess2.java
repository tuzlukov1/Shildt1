package ShildtBook.chapter3.�����;

//���� � ���������� ����
public class Guess2 {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, answer = 'K';

        System.out.println("�������� ����� �� ��������� A - Z");
        System.out.print("�������� �� ");

        ch = (char) System.in.read(); //������ ������� � ����������

        if(ch == answer) System.out.println("***���������!***");
        else System.out.println("...�� �� �������");


    }
}