package JavaRush;

import java.util.Scanner;

/*
Сломанная клавиатура
*/

public class BrokenKeyboard {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String enterText = sc.nextLine();

        if(enterText.equalsIgnoreCase(enterText))
            //напишите тут ваш код
            System.out.println("доступ разрешен");
            //напишите тут ваш код
        else System.out.println("доступ запрещен");
    }
}

