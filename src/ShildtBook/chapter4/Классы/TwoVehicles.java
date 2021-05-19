package ShildtBook.chapter4.Классы;

public class TwoVehicles {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportsCar = new Vehicle();

        int range, range2;

        //Присвоение значений полям в объекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportsCar.passengers = 2;
        sportsCar.fuelcap = 14;
        sportsCar.mpg = 12;

        //расчет дальности поездки с полным баком горючего
        range = minivan.fuelcap * minivan.mpg;
        range2 = sportsCar.fuelcap * sportsCar.mpg;

        System.out.println("Мини - фургон может перевезти " + minivan.passengers
                + " пассажиров на расстояние " + range + " миль.");

        System.out.println("Спорткар может перевезти " + sportsCar.passengers
                + " пассажиров на расстояние " + range2 + " миль.");
    }
}
