package chapter4.Классы;
//параметризованный конструктор
class MyClassParam {
    int x;

    MyClassParam(int i){
        x = i;
    }
}

class ParamConsDemo {
    public static void main(String[] args) {
        MyClassParam t1 = new MyClassParam(10);
        MyClassParam t2 = new MyClassParam(88);

        System.out.println(t1.x + " " + t2.x);

    }
}
