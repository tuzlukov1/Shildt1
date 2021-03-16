package chapter4.Классы;

public class CompFuel {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        double gallons;
        int dist = 252;


        //Присваивание значений полям объекта minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //Присваивание значений полям объекта sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelNeeded(dist);

        System.out.println("Для преодоления " + dist + " миль минивену потребуется " + gallons + " галлонов топлива." );

        gallons = sportscar.fuelNeeded(dist);
        System.out.println("Для преодоления " + dist + "миль спорткару потребуется " + gallons + " галлонов топлива." );
    }
}
