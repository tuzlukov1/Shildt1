package chapter4.������;

class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    int range() {
        return mpg*fuelcap;
        }
/*���������� ������������������ ������ � ������� ����������� ������ ������ �������,
* ������������ ������������� �������� ��� ����������� ��������� ����������. */
    double fuelNeeded(int miles) {
        return (double) miles / mpg;

        }
    }

    class RetMeth{
        public static void main(String[] args) {
            Vehicle minivan = new Vehicle();
            Vehicle sportscar = new Vehicle();

            int range1, range2;

            //������������ �������� ����� ������� minivan
            minivan.passengers = 7;
            minivan.fuelcap = 16;
            minivan.mpg = 21;

            //������������ �������� ����� ������� sportscar
            sportscar.passengers = 2;
            sportscar.fuelcap = 14;
            sportscar.mpg = 12;


            System.out.println("���� ������ ����� ��������� " + minivan.passengers
                    + " ���������� �� ���������� " + minivan.range() + " ����.");
             //����������� ���������� � ��������� ������� ����-�������

            System.out.println("���������� ���������� ����� ��������� " + sportscar.passengers
                    + " ���������� �� ���������� " + sportscar.range() + " ����.");

        }
    }

