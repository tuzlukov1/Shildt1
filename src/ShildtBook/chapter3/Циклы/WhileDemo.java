package ShildtBook.chapter3.÷иклы;
//демонстраци€ работы цикла while
public class WhileDemo {
    public static void main(String[] args) {
        char ch;

        //вывод букв английского алфавита, использу€ цикл while
        ch = 'a';

        while (ch<='z') {
            System.out.println(ch);
            ch++;
        }
    }
}
