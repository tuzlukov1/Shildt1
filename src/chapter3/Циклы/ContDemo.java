package chapter3.�����;
//���������� ���������� continue
public class ContDemo {
    public static void main(String[] args) {
        int i;

        //����� ������ ����� � �������� �� 0 �� 100
        for(i = 0; i <= 100; i++ ) {
            if((i%2) != 0) continue;
            System.out.println(i);
        }

        for (i = 0; i <10;i++){
            System.out.print(i+ " ");
            if(i%2 == 0) continue; //���� ������ �� � ������� �� �������, ���� ��������, �� ������� ������ ����������
            /*0 1
            * 2 3
            * 4 5
            * 6 7
            * 8 9
            *  */
            System.out.println();
        }
    }
}
