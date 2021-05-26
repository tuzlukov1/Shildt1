package JavaRush;

import java.util.Scanner;

/*
¬ысока€ точность
*/

public class MillionPiece {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            if (Math.abs(a - b) < 0.000001)
                System.out.println("числа равны");
            else
                System.out.println("числа не равны");
        }
    }
