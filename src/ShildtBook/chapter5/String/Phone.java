package ShildtBook.chapter5.String;

//простейший автоматизированный телефонный справочник
public class Phone {
    public static void main(String[] args) {
        String numbers[][] = {
                {"Tom", "555-3322"},
                {"Mary", "555-1119"},
                {"John", "555-5124"},
                {"Rachel", "555-6235"}
        };
        int i;

        //Для того, чтобы воспользоваться программой, ей нужно передать один аргумент командной строки
        if (args.length != 1)
            System.out.println("Использование: java Phone <name>");
        else {
            for (i=0; i < numbers.length; i++) {
                if(numbers[i][0].equals(args[0])) { //в этой строке происходит сравнение по первому массиву имен
                    System.out.println(numbers[i][0] +": " + numbers[i][1]);
                    break;
                }
            }
            if (i== numbers.length)
                System.out.println("Имя не найдено.");
        }
    }
}
