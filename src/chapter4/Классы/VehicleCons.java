package chapter4.������;
//���������� ������������

    class VehiclePreFinal {
    int passengers; //���������� ����������
    int fuelcap; //������� ���������� ����
    int mpg; //����������� ������� � ����� �� ������

    //����������� ������ VehiclePreFinal
    VehiclePreFinal(int p, int f, int m){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    //����������� ��������� ������� ������������� ��������
    int range() {
        return mpg * fuelcap;
    }

    //������ ������ �������, ������������ ������������� �������� ��� ����������� ��������� ����������
    double fuelNeeded(int miles) {
        return (double) miles/mpg;
    }
}

class VehConsDemo {
    public static void main(String[] args) {

        //���������� �������� �������� ������������ �������
        VehiclePreFinal minivan = new VehiclePreFinal(7,16,21);
        VehiclePreFinal sportcar = new VehiclePreFinal(2,14,12);

        double gallons;
        int dist = 252;

        gallons = minivan.fuelNeeded(dist);

        System.out.println("��� ����������� " + dist + " ����, ���� ������� ����������� "
                            + gallons + " �������� �������. ");

        gallons = sportcar.fuelNeeded(dist);
        System.out.println("��� ����������� " + dist + " ����, ��������� ����������� "
                + gallons + " �������� �������. ");
    }
}
