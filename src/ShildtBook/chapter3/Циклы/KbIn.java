package ShildtBook.chapter3.Циклы;

//Чтение текста с клавиатуры
public class KbIn {
    public static void main(String[] args)
        throws java.io.IOException {
            char ch;

        System.out.println("Нажмите нужную клавишу, затем нажмите энтер: ");
        ch = (char)System.in.read();

        System.out.println("вы нажали клавишу " + ch);
    }
}

