package chapter5.Exercises;
//Демонстрация алгоритма пузырьковой сортировки строк
public class StrBubble {
    public static void main(String[] args) {
        String strs[] = {"this", "is", "a", "test", "of", "a", "string", "sort"};

        int a, b;
        String t;
        int size;

        size = strs.length; // колво сортируемых элементов

        //отображение исходного массива
        System.out.print("Исходный массив:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + strs[i]);
        System.out.println();

        //пузырьковая сортировка строк
        for (a=1; a < size; a++)
            for (b = size-1; b >=a; b--) {
                //поменять элементы местами при нарушении
                //порядка их следования
                if(strs[b-1].compareTo(strs[b]) > 0) {
                    t = strs[b-1];
                    strs[b-1] = strs[b];
                    strs[b] = t;
                }
            }
        //Отображение отсортированного массива
        System.out.print("Отсортированный массив:");
            for (int i = 0; i < size; i++)
                System.out.print(" " + strs[i]);
        System.out.println();
    }
}
