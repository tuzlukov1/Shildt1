package JavaRush;

import java.util.Scanner;

public class Poem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("Люблю тебя Петра творенье, \n" + "Люблю твой строгий стройный вид \n");
        String s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
    }
}
