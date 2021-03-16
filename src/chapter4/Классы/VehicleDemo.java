package chapter4.Классы;



//в этом классе обявляется объект типа Vehicle
class VehicleDemo{
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        //Присвоение значений полям в объекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //расчет дальности поездки с полным баком горючего
        range = minivan.fuelcap* minivan.mpg;
        System.out.println("Мини - фургон может перевезти "+ minivan.passengers
                + " пассажиров на расстояние " + range + " миль.");
    }
}
