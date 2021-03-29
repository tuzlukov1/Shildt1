package chapter5.“ипы_данных_и_операторы;

public class ArrayDemo {
    public static void main(String[] args) {
        int sample[] = new int[10];
        int i;

        for(i = 0; i < 10; i = i+1)
            sample[i] = i;

        for(i = 0; i < 10; i = i+1)
            System.out.println("Ёлемент[" + i + "]: " + sample[i]);
    }
}
