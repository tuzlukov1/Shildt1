package JavaRush;

public class Equal3 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            if (i % 3 == 0) {
                i++;
                continue;
            } else sum += i;
            i++;
        }
        System.out.println("����� ����� �� 1 �� 100 �� ������� 3 = " + sum);
    }
}
