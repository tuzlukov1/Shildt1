package JavaRush;

import java.util.Scanner;

public class Enough {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = "";
        while(true){
            if (!st.equals("enough")) {
                System.out.println(st);
                st = sc.nextLine();
            }
            else break;
        }
    }
}
