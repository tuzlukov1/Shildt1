package chapter5.String;

//���������� ������ substring();
public class SubStr {
    public static void main(String[] args) {
        String orgStr = "Java - ��������� ���������.";

        //������������ ���������
        String subStr = orgStr.substring(7, 26); //��������� ����� ������ , ���������� ������ ���������

        System.out.println("orgstr: " + orgStr);
        System.out.println("substr: " + subStr);
    }
}
