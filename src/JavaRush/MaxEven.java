package JavaRush;

import java.util.Scanner;

public class MaxEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while(sc.hasNextInt()){
            int ch = sc.nextInt();
            if((ch>max)&&(ch%2==0)) max = ch;
            else continue;
        }
        System.out.println(max);
    }
}
