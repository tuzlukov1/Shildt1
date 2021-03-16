package chapter4.Классы;

class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    int range() {
        return mpg*fuelcap;
        }
/*Добавление параметризованного метода в котором выполняется расчет объема топлива,
* необходимого транспортному средству для преодоления заданного расстояния. */
    double fuelNeeded(int miles) {
        return (double) miles / mpg;

        }
    }

    class RetMeth{
        public static void main(String[] args) {
            Vehicle minivan = new Vehicle();
            Vehicle sportscar = new Vehicle();

            int range1, range2;

            //Присваивание значений полям объекта minivan
            minivan.passengers = 7;
            minivan.fuelcap = 16;
            minivan.mpg = 21;

            //Присваивание значений полям объекта sportscar
            sportscar.passengers = 2;
            sportscar.fuelcap = 14;
            sportscar.mpg = 12;


            System.out.println("Мини фургон может перевезти " + minivan.passengers
                    + " пассажиров на расстояние " + minivan.range() + " миль.");
             //отображение информации о дальности поездки мини-фургона

            System.out.println("Спортивный автомобиль может перевезти " + sportscar.passengers
                    + " пассажиров на расстояние " + sportscar.range() + " миль.");

        }
    }

