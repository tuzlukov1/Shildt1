package ShildtBook.chapter5.ternarOp;

public class Man {
    private int age;

    public Man(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        Man man = new Man(22);

        String securityAnswer = man.getAge() >= 18 ? "�� � �������, ���������" : "���� ����� �� �������� ��� ������ ��������!";


        System.out.println(securityAnswer);

    }
}
