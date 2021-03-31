package chapter5.String;
//демонстраци€ использовани€ массивов строк

public class StringArrays {
    public static void main(String[] args) {
        String strs[] = {"Ёта", "строка", "€вл€етс€", "тестом"};

        System.out.println("»сходный массив: ");

        for (String s: strs)
            System.out.print(s + " ");
        System.out.println("\n");

        //изменение строки
        strs[2] = "также €вл€етс€";
        strs[3] = "тестом";

        System.out.println("»змененный массив: ");
        for (String s : strs)
            System.out.print(s + " ");
    }
}
