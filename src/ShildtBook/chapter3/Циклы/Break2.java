package ShildtBook.chapter3.Циклы;
//чтение вводимых данных с клавиатуры пока не будет получена буква q
public class Break2 {
    public static void main(String[] args) throws java.io.IOException {
        char ch;

        for ( ; ; ) {
            ch = (char) System.in.read(); //получение символа с клавиатуры
            if (ch == 'q') break;

        }
        System.out.println("Вы нажали клавишу q!");
    }
}
