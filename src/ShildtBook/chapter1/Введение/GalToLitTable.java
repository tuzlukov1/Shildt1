package ShildtBook.chapter1.��������;

public class GalToLitTable {

/*
    ���. 1.2 ��� ��������� ���������� ������� �������� �������� � �����
     */


        public static void main(String[] args) {
            double gallons, liters;
            int counter;

            counter = 0;
            for (gallons = 1; gallons<=100; gallons++)
            {
                liters = gallons * 3.7854; // �������������� � �����
                System.out.println(gallons + " �������� ������������� " + liters + " �����.");
                counter++;
                if(counter == 10) {
                    System.out.println();
                    counter = 0;
                }

            }
        }
    }


