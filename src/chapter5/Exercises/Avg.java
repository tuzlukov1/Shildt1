package chapter5.Exercises;

public class Avg {
    public static void main(String[] args) {
        double nums[] = {1.3, 1.4, 1.7, 8.3, 8.6, 9.1, 2.3, 4.5, 3.3, 7.9};

        double sum = 0;
        for(int i = 0; i < nums.length; i++)
            sum += nums[i];

        System.out.println("Среднее значение: " + sum / nums.length);
    }

}
