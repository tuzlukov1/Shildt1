package ShildtBook.chapter4.������;

public class TwoVehicles {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportsCar = new Vehicle();

        int range, range2;

        //���������� �������� ����� � ������� minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportsCar.passengers = 2;
        sportsCar.fuelcap = 14;
        sportsCar.mpg = 12;

        //������ ��������� ������� � ������ ����� ��������
        range = minivan.fuelcap * minivan.mpg;
        range2 = sportsCar.fuelcap * sportsCar.mpg;

        System.out.println("���� - ������ ����� ��������� " + minivan.passengers
                + " ���������� �� ���������� " + range + " ����.");

        System.out.println("�������� ����� ��������� " + sportsCar.passengers
                + " ���������� �� ���������� " + range2 + " ����.");
    }
}
