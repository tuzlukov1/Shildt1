package ShildtBook.chapter6.MethodsClasses;
/*в этом классе реализуется отказоустойчивый массив, предотвращающий ошибки времени выполнения*/

public class FailSoftArray {
    private int a[]; //ссылка на массив

    private int errval; //значение, возвращаемое в случае возникновения ошибки
                        //при выполнении метода get()

    public int length; //открытая переменная length

    //Конструктору данного класса передаются размер массива и значение,
    //которое должен возвращать метод get() при возникновении ошибки
    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }

    //возврат значения элемента массивас заданным индексом
    public int get(int index) {
        if(indexOK(index)) return a[index]; //отслеживание попытки выхода за пределы массива
        return errval;
    }

    //установка значения элемента с заданным индексом.
    //если возникает ошибка, вернуть логическое значение false
    public boolean put(int index, int val) {
        if(indexOK(index)) { //отслеживание попытки выхода за пределы массива
            a[index] = val;
            return true;
        }
        return false;
    }

    //Возврат логического значения true, если индекс не выходит за пределы массива
    private boolean indexOK(int index) {
        if (index >= 0 & index < length) return true;
        return false;
    }
}

//Демонстрация работы с отказоустойчивым массивом
class FSDemo {
    public static void main(String args[]) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        //демонстрация корректной обработки ошибок
        System.out.println("Обработка ошибок без вывода отчета.");
        for (int i = 0; i < (fs.length*2); i++)
            fs.put(i, i*10); //для обращения к элементам массива должны использоваться его методы доступа
        for (int i=0; i < (fs.length*2); i++) {
            x = fs.get(i);
            if(x != -1) System.out.print(x + " ");
        }
        System.out.println("");

        //обработка ошибок
        System.out.println("\nОбработка ошибок с выводом отчета.");
        for (int i=0; i < (fs.length*2); i++) {
            x = fs.get(i);
            if (x!=-1) System.out.print(x +  " ");
            else System.out.println("Индекс " + i + " вне допустимого диапазона");
        }
    }
}
