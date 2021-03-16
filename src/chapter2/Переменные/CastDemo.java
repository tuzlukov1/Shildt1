package chapter2.Переменные;
//демонстрация приведения типов

public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;

        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x/y); //привести тип дабл к типу инт , теряется дробная часть числа
        System.out.println("Целочисленный результат деления х / у : " + i);

        i = 100;
        b = (byte) i; //В этом случае информация не теряется, тип byte может содержать значение 100
        System.out.println("Значение b : " + b);

        i = 257;
        b = (byte) i; //В этом раз информация теряется, тип byte не может содержать значение 257
        System.out.println("Значение b : " + b);

        b = 88;
        ch = (char) b;
        System.out.println("Значение ch : " + ch);
    }
}
