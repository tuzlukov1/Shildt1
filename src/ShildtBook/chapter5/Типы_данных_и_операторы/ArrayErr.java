package ShildtBook.chapter5.Типы_данных_и_операторы;
//Намеренный выход за пределы массива
public class ArrayErr {
    public static void main(String[] args) {
        int sample[] = new int[10];
        int i;

        //Имитация выхода индекса за пределы массива
        for (i = 0; i < 100; i = i+1)
            sample[i] = i;
    }
}
