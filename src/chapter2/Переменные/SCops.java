package chapter2.����������;

public class SCops {
    public static void main(String[] args) {
        int n,d,q;

        n = 10;
        d = 2;
        if(d!=0 && (n%d) == 0)
            System.out.println(d + " �������� ��������� " + n);

        d = 0; //���������� ��� d ������� ��������

        //������ ������� �� ����������� , �� d = 0
        if(d != 0 && (n%d) == 0) //����������� �������� ������������� ������� �� ����
            System.out.println(d + " �������� ��������� " + n);

        //��� ������������ ��������� ��������� ������ ������� �� ����
        if(d != 0 & (n%d) == 0) //����������� �������� ������������� ������� �� ����
            System.out.println(d + " �������� ��������� " + n);
    }
}
