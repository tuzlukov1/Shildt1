package ShildtBook.chapter5.Типы_данных_и_операторы;
//использование цикла типа for-each
public class ForEach {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        //использование цикла типа for-each для
        //суммирования и отображения значений
        for (int x : nums) { //цикл типа for-each
            System.out.println("Значение: " + x);
            sum += x;
            if (x == 5) break; //прерывание цикла for-each при достижении 5
        }

        System.out.println("Сумма: " + sum);
    }
}
