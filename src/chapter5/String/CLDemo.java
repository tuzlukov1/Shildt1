package chapter5.String;

//отображение параметров командной строки (CLI arguments)
public class CLDemo {
    public static void main(String[] args) {
        System.out.println("ѕрограмме передано " + args.length + " аргумента командной строки.");

        System.out.println("—писок аргументов: ");
        for (int i=0; i<args.length;i++)
            System.out.println("arg[" + i + "]: " + args[i]);
    }
}
