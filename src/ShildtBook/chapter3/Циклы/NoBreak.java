package ShildtBook.chapter3.Циклы;

public class NoBreak {
    public static void main(String[] args) {
        int i;

        for (i = 0; i <= 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("i меньше 1");
                case 1:
                    System.out.println("i меньше 2");
                case 2:
                    System.out.println("i меньше 3");
                case 3:
                    System.out.println("i меньше 4");
                case 4:
                    System.out.println("i меньше 5");
            }
            System.out.println();

            switch (i) {
                case 1:
                case 2:
                case 3:
                    System.out.println("i равно 1,2 или 3");
                    break;
                case 4:
                    System.out.println("i = 4");
                    break;
            }
        }
    }
}
