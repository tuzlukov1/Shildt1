package chapter3.Циклы;
//применение инструкции continue
public class ContDemo {
    public static void main(String[] args) {
        int i;

        //вывод четных чисел в пределах от 0 до 100
        for(i = 0; i <= 100; i++ ) {
            if((i%2) != 0) continue;
            System.out.println(i);
        }

        for (i = 0; i <10;i++){
            System.out.print(i+ " ");
            if(i%2 == 0) continue; //если четное то в принтлн не заходит, если нечетное, то заходит отсюда получается
            /*0 1
            * 2 3
            * 4 5
            * 6 7
            * 8 9
            *  */
            System.out.println();
        }
    }
}
