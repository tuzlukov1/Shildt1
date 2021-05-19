package ShildtBook.chapter1.¬ведение;

public class InchToMetres {

/*
    упр. 1.2 эта программа отображает таблицу перевода дюймов в метры
     */


        public static void main(String[] args) {
            double inches, metres;
            int counter;

            counter = 0;
            for (inches = 1; inches<=144; inches++)
            {
                metres = inches / 39.37; // преобразование в литры
                System.out.println(inches + " дюймам соответствует " + metres + " метров.");
                counter++;
                if(counter == 12) {
                    System.out.println();
                    counter = 0;
                }

            }
        }
    }


