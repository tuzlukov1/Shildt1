package chapter2.Переменные;
/*Вычисление расстояния в километрах до крупного оъекта по времени эха */
public class Echo {
    public static void main(String[] args) {
        double sec;
        double distanceKm;

        sec = 7;
        distanceKm = (sec*0.33)/2;

        System.out.println("Расстояние до крупного объекта," +
                "эхо от которого пришло через " +
                sec + " секунд, равно " + distanceKm + " км");


    }
}
