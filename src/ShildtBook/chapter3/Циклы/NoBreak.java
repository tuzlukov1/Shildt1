package ShildtBook.chapter3.�����;

public class NoBreak {
    public static void main(String[] args) {
        int i;

        for (i = 0; i <= 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("i ������ 1");
                case 1:
                    System.out.println("i ������ 2");
                case 2:
                    System.out.println("i ������ 3");
                case 3:
                    System.out.println("i ������ 4");
                case 4:
                    System.out.println("i ������ 5");
            }
            System.out.println();

            switch (i) {
                case 1:
                case 2:
                case 3:
                    System.out.println("i ����� 1,2 ��� 3");
                    break;
                case 4:
                    System.out.println("i = 4");
                    break;
            }
        }
    }
}
