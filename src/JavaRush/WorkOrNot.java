package JavaRush;

import java.util.Scanner;

/*
Работать или не работать - вот в чем вопрос
*/
public class WorkOrNot {


    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if ((age > 60) || (age < 20))
            System.out.println("можно не работать");
    }
}


