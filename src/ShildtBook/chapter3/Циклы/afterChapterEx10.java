package ShildtBook.chapter3.�����;
//�������������� ��������
public class afterChapterEx10 {
    public static void main(String[] args) throws java.io.IOException{
        char ch = ' ';
        int count = 0;
        System.out.println("������� ������ ��� ��������� ��� ��������(��� ��������� ������� \".\"):");
        while (ch != '.'){
            ch = (char) System.in.read();
            if ((ch >='a') && (ch <= 'z')) {
                System.out.println("��������� ������: " + ch);
                ch = (char) (ch - 32);
                System.out.println("���������� ������: " + ch);
                System.out.println(ch);
                count++;
            }
            else if ((ch >='A') && (ch <= 'Z')) {
                System.out.println("��������� ������: " + ch);
                ch += (char) (ch + 32);
                System.out.println("���������� ������: " + ch);
                count++;
            }



        }
        System.out.println("�������� ��������: "+ count);
    }

}
