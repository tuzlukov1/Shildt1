package chapter4.Классы;
//добавление конструктора

    class VehiclePreFinal {
    int passengers; //количество пассажиров
    int fuelcap; //емкость топливного бака
    int mpg; //потребление топлива в милях на галлон

    //конструктор класса VehiclePreFinal
    VehiclePreFinal(int p, int f, int m){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    //определение дальности поездки транспортного средства
    int range() {
        return mpg * fuelcap;
    }

    //расчет объема топлива, необходимого транспортному средству для преодоления заданного расстояния
    double fuelNeeded(int miles) {
        return (double) miles/mpg;
    }
}

class VehConsDemo {
    public static void main(String[] args) {

        //завершение создания объектов транспортных средств
        VehiclePreFinal minivan = new VehiclePreFinal(7,16,21);
        VehiclePreFinal sportcar = new VehiclePreFinal(2,14,12);

        double gallons;
        int dist = 252;

        gallons = minivan.fuelNeeded(dist);

        System.out.println("Для преодоления " + dist + " миль, мини фургону потребуется "
                            + gallons + " галлонов топлива. ");

        gallons = sportcar.fuelNeeded(dist);
        System.out.println("Для преодоления " + dist + " миль, спорткару потребуется "
                + gallons + " галлонов топлива. ");
    }
}
