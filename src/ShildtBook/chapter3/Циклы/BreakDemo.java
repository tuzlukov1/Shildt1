package ShildtBook.chapter3.�����;
//���������� break ��� ������ �� �����
public class BreakDemo {
    public static void main(String[] args) {
        int num;

        num = 100;

        //���������� ����� �� ��� ���, ���� ������� ��������
        //���������� i ������ �������� ���������� num

        for (int i = 0; i < num; i++) {
            if(i*i >= num) break; //����������� ���������� �����, ���� i*i >= 100
            System.out.println(i + " ");
        }
        System.out.print("���� ��������.");
    }
}
