package ShildtBook.chapter3.�����;

public class Guess4 {
    public static void main(String[] args)
    throws java.io.IOException {
        char ch, ignore, answer = 'K';

        do {
            System.out.println("�������� ����� �� ��������� �-Z");
            System.out.println("����������� �� �������");

            //��������� ������� � ����������
            ch = (char) System.in.read();

            //������������ ������ �������� �� ������� ������
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

                if (ch == answer) System.out.println("���������!");
                else {
                    System.out.println("... ��������, ������ ����� ��������� ");
                    if (ch<answer) System.out.println("����� � ����� ��������");
                    else System.out.println("����� � ������ ��������");
                    System.out.println("��������� �������! \n");
                }
        } while (answer != ch);


    }
}
