package ShildtBook.chapter3.�����;
//������ �������� ������ � ���������� ���� �� ����� �������� ����� q
public class Break2 {
    public static void main(String[] args) throws java.io.IOException {
        char ch;

        for ( ; ; ) {
            ch = (char) System.in.read(); //��������� ������� � ����������
            if (ch == 'q') break;

        }
        System.out.println("�� ������ ������� q!");
    }
}
