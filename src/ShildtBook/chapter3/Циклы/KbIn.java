package ShildtBook.chapter3.�����;

//������ ������ � ����������
public class KbIn {
    public static void main(String[] args)
        throws java.io.IOException {
            char ch;

        System.out.println("������� ������ �������, ����� ������� �����: ");
        ch = (char)System.in.read();

        System.out.println("�� ������ ������� " + ch);
    }
}

