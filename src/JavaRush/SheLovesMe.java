package JavaRush;

import java.util.Scanner;

public class SheLovesMe {
    public static void main(String[] args) {
        String text = " любит меня.";
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int i = 0;
        while(i<10) {
            System.out.println(name + text);
            i++;
        }

    }
}
