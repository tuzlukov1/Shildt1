package JavaRush;

public class b10x20 {
    public static void main(String[] args) {
        int i = 0, j = 0;
        while (i < 10) {
            while (j < 20) {
                if ((i == 0) || (j==0) || (i==9)||(j==19)) {
                    System.out.print("Á");
                    j++;
                }
                else {
                    System.out.print(" ");
                    j++;
                }
            }
            j = 0;
            System.out.println();
            i++;
        }
    }
}

