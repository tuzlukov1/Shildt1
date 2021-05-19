package ShildtBook.chapter3.Циклы;
//преобразование символов
public class afterChapterEx10 {
    public static void main(String[] args) throws java.io.IOException{
        char ch = ' ';
        int count = 0;
        System.out.println("Введите символ для изменения его регистра(для остановки введите \".\"):");
        while (ch != '.'){
            ch = (char) System.in.read();
            if ((ch >='a') && (ch <= 'z')) {
                System.out.println("Введенный символ: " + ch);
                ch = (char) (ch - 32);
                System.out.println("Измененный символ: " + ch);
                System.out.println(ch);
                count++;
            }
            else if ((ch >='A') && (ch <= 'Z')) {
                System.out.println("Введенный символ: " + ch);
                ch += (char) (ch + 32);
                System.out.println("Измененный символ: " + ch);
                count++;
            }



        }
        System.out.println("Изменено символов: "+ count);
    }

}
