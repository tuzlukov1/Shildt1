package ShildtBook.chapter3.�����;

public class ContToLabel {
    public static void main(String[] args) {

        outerloop:
                for(int i = 1; i < 10; i++) {
                    System.out.print("\n������� ����: ������ #" + i + ", ���������� ����: \n");
                    for (int j = 1; j < 10; j++) {
                        if(j == 5) continue outerloop; //����������� �������� �����
                        System.out.println("������ #"+j);
                    }
                }
    }
}
