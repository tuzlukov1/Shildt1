package ShildtBook.chapter2.Переменные;

//Неожиданный результат повышения типов
public class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b; // приведение не требуется, тк байт уже повышен до инт

        b = 10;
        b = (byte) (b*b); //нужно приведение типов! тк б умножается на саму себя изначально байтовую

        System.out.println("i и b: " + i + " " + b);


    }
}
