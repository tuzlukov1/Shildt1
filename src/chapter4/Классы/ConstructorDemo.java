package chapter4.������;
//������� �����������
class MyClass {
    int x;

    MyClass(){
        x = 10;
    }
}
class ConstructorDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();

        System.out.println(t1.x + " " + t2.x);
    }
}
