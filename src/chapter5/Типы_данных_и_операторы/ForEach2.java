package chapter5.“ипы_данных_и_операторы;
//использование расширенного цикла for дл€ обработки двумерного массива

public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[][] = new int[3][5];

        //¬вод р€да значений в массив nums
        for (int i = 0; i < 3; i++)
            for (int j =0; j < 5; j++)
                nums[i][j] = (i+1)*(j+1);

            //»спользование цикла типа for-each дл€ суммировани€ и отображени€ значений.
        for (int x[] : nums) { //переменна€ x объ€вл€етс€ как массив значений int.
            for (int y : x) {
                System.out.println("«начение: " + y);
                sum += y;

            }
        }
        System.out.println("—умма: " + sum);
    }
}
