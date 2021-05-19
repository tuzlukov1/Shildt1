package ShildtBook.chapter6.MethodsClasses;
/*� ���� ������ ����������� ���������������� ������, ��������������� ������ ������� ����������*/

public class FailSoftArray {
    private int a[]; //������ �� ������

    private int errval; //��������, ������������ � ������ ������������� ������
                        //��� ���������� ������ get()

    public int length; //�������� ���������� length

    //������������ ������� ������ ���������� ������ ������� � ��������,
    //������� ������ ���������� ����� get() ��� ������������� ������
    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }

    //������� �������� �������� �������� �������� ��������
    public int get(int index) {
        if(indexOK(index)) return a[index]; //������������ ������� ������ �� ������� �������
        return errval;
    }

    //��������� �������� �������� � �������� ��������.
    //���� ��������� ������, ������� ���������� �������� false
    public boolean put(int index, int val) {
        if(indexOK(index)) { //������������ ������� ������ �� ������� �������
            a[index] = val;
            return true;
        }
        return false;
    }

    //������� ����������� �������� true, ���� ������ �� ������� �� ������� �������
    private boolean indexOK(int index) {
        if (index >= 0 & index < length) return true;
        return false;
    }
}

//������������ ������ � ���������������� ��������
class FSDemo {
    public static void main(String args[]) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        //������������ ���������� ��������� ������
        System.out.println("��������� ������ ��� ������ ������.");
        for (int i = 0; i < (fs.length*2); i++)
            fs.put(i, i*10); //��� ��������� � ��������� ������� ������ �������������� ��� ������ �������
        for (int i=0; i < (fs.length*2); i++) {
            x = fs.get(i);
            if(x != -1) System.out.print(x + " ");
        }
        System.out.println("");

        //��������� ������
        System.out.println("\n��������� ������ � ������� ������.");
        for (int i=0; i < (fs.length*2); i++) {
            x = fs.get(i);
            if (x!=-1) System.out.print(x +  " ");
            else System.out.println("������ " + i + " ��� ����������� ���������");
        }
    }
}
