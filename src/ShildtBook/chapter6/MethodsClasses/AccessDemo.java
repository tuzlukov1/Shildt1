package ShildtBook.chapter6.MethodsClasses;

//��������� ������������� ������� public � private
class MyClass {
    private int alpha; //�������� ������
    public int beta; //�������� ������
    int gamma; //��� ������� �� ���������, �� ���� public

    //������ ������� � ���������� alpha. ����� ������ ����� ���������� � �������� ������ ���� �� ������

    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }

}
public class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();
        //������ � ���������� alpha �������� ������ � ������� ���������� ��������������� ��� ���� ���� �������
        ob.setAlpha(-99);
        System.out.println("ob.alpha: " + ob.getAlpha());

        //��������� � ���������� alpha ���, ��� �������� ���� - �����������,
        //ob.alpha = 10; //������, alpha - �������� ����������

        //��������� ��������� ������ ���������, ��� ��� ���������� beta � gamma �������� ���������;
        ob.beta = 88;
        ob.gamma = 99;

    }
}
