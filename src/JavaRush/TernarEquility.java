package JavaRush;

public class TernarEquility {
    public static String string1 = "�����";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {
        String same = "������ �� ������ ����������";
        String different = "������ �� ������ ������";
        //�������� ��� ��� ���
        System.out.println((string1 == string2) ? same : different);
        System.out.println((string1 == string3) ? same : different);
        System.out.println((string2 == string3) ? same : different);
    }
}

