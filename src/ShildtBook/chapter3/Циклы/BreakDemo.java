package ShildtBook.chapter3.Циклы;
//применение break для выхода из цикла
public class BreakDemo {
    public static void main(String[] args) {
        int num;

        num = 100;

        //Выполнение цикла до тех пор, пока квадрат значения
        //переменной i меньше значения переменной num

        for (int i = 0; i < num; i++) {
            if(i*i >= num) break; //прекращение выполнения цикла, если i*i >= 100
            System.out.println(i + " ");
        }
        System.out.print("Цикл завершен.");
    }
}
