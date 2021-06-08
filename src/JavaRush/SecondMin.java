package JavaRush;

import java.util.Scanner;

public class SecondMin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE, minres = Integer.MAX_VALUE;

        while (sc.hasNextInt()) {
            int ch = sc.nextInt();
            if (ch < min) {
                minres = min;
                min = ch;
            }

            if((min<ch)&&(ch<minres)){
                minres = ch;
            }
        }
        System.out.println(minres);
    }
}

