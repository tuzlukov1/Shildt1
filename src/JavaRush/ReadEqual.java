package JavaRush;


import java.util.Scanner;


public class ReadEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        if (a.equals(b))
            //напишите тут ваш код
            System.out.println("строки одинаковые");
            //напишите тут ваш код
        else System.out.println("строки разные");
    }
}

