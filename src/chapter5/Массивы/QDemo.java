package chapter5.Массивы;
//класс, реализующий очередь для хранения символов
class Queue {
    char q[];           //массив для хранения элементов очереди

    int putloc, getloc; //индексы для вставки и извлечения элементов очереди

    Queue(int size) {
        q = new char[size]; //выделение памяти для очереди
        putloc = getloc = 0;
    }

    //помещение символа в очередь
    void put(char ch) {
        if(putloc==q.length) {
            System.out.println(" - Очередь заполнена!");
            return;
        }
        q[putloc++] = ch;
    }

    //извлечение символа из очереди
    char get() {
        if(getloc == putloc) {
            System.out.println(" -Очередь пуста");
            return (char) 0;
        }
        return q[getloc++];
    }

}
//демонстрация использования класса Queue
public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Использование очереди bigQ для сохранения алфавита");
        //помещение буквенных символов в очередь bigQ
        for (i=0; i < 26; i++)
            bigQ.put((char) ('A' + i));
        //извлечение и отображение буквенных символов из очереди bigQ
        System.out.print("Содержимое очереди bigQ: ");
        for(i = 0; i < 26; i++){
            ch = bigQ.get();
            if (ch!= (char) 0) System.out.print(ch);
        }

        System.out.println("\n");

        System.out.println("Использование очереди smallQ для генерации ошибок");

        //использование очереди smallQ для генерации ошибок
        for (i = 0; i < 5; i++) {
            System.out.print("Попытка сохранениея " + (char) ('Z' - i));

            smallQ.put((char) ('Z' - i));

            System.out.println();
        }
        System.out.println();

        //дополнительные ошибки при обращении к очереди smallQ
        System.out.print("Содержимое очереди smallQ: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();

            if(ch != (char) 0) System.out.print(ch);
        }
    }
}
