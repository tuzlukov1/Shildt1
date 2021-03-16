package chapter2.Переменные;
/*Вычисление расстояния в километрах до вспышки молнии */
public class Lightning {
    public static void main(String[] args) {
        double sec;
        double distanceKm;

        sec = 7;
        distanceKm = sec*0.33;

        System.out.println("Расстояние до места молнии, " +
                "звук от которой пришел через " +
                sec + " секунд, равен " + distanceKm + " км");


    }
}
