package chapter3.Циклы;

public class afterChapterEx1 {
    public static void main(String[] args) throws java.io.IOException {
        char ch;
        int spacesNum = 0;
        do {
            ch = (char) System.in.read();
            if (ch == ' ') spacesNum++;

        }while (ch != '.');
        System.out.println("Пробелов введено: " + spacesNum);
    }
}
