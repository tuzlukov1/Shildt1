package chapter5.String;

//����������� ���������� ��������� ������ (CLI arguments)
public class CLDemo {
    public static void main(String[] args) {
        System.out.println("��������� �������� " + args.length + " ��������� ��������� ������.");

        System.out.println("������ ����������: ");
        for (int i=0; i<args.length;i++)
            System.out.println("arg[" + i + "]: " + args[i]);
    }
}
