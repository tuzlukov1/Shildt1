package ShildtBook.chapter3.Циклы;

//Игра в угадывание букв
public class Guess3 {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, answer = 'K';

        System.out.println("Задумана буква из диапазона A - Z");
        System.out.print("Угадайте ее ");

        ch = (char) System.in.read(); //чтение символа с клавиатуры

        if(ch == answer) System.out.println("***ПРАВИЛЬНО!***");
        else System.out.println("...Вы не угадали, нужная буква ");

        if (ch < answer) System.out.println("Ближе к концу алфавита");
        else System.out.println("ближе к началу алфавита:");


    }
}