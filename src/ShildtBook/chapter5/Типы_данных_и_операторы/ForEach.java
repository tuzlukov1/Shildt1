package ShildtBook.chapter5.����_������_�_���������;
//������������� ����� ���� for-each
public class ForEach {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        //������������� ����� ���� for-each ���
        //������������ � ����������� ��������
        for (int x : nums) { //���� ���� for-each
            System.out.println("��������: " + x);
            sum += x;
            if (x == 5) break; //���������� ����� for-each ��� ���������� 5
        }

        System.out.println("�����: " + sum);
    }
}
