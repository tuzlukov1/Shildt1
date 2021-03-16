package chapter2.ѕеременные;
/* ¬ этой программе предпринимаетс€ попытка объ€вить во внутренней
области действи€ переменную с таким же именем, как и у переменной,
объ€вленной во внешней области действи€.
***
Ёта программа не пройдет компил€цию

*/

public class NestVar {
    public static void main(String[] args) {
        int count;

        for(count = 0; count<10; count = count + 1) {
            System.out.println("«начение count: " + count);


            //int count;
            for (count = 0; count < 2; count ++)
                System.out.println("Error! count зан€т");
        }
    }


}
