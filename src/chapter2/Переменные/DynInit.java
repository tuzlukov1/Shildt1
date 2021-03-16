package chapter2.Переменные;

public class DynInit {
    public static void main(String[] args) {
        double radius = 4, height = 5;

        //Переименная volume инициализируется динамически во время выполнения программы

        double volume = 3.1416 * radius * radius * height;

        System.out.println("Объем: " + volume); // переменная volume динамически инициализируется во время выполнения

    }
}
