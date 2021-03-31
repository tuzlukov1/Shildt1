package chapter5.String;

//применение метода substring();
public class SubStr {
    public static void main(String[] args) {
        String orgStr = "Java - двигатель Интернета.";

        //Сформировать подстроку
        String subStr = orgStr.substring(7, 26); //создается новая строка , содержащая нужную подстроку

        System.out.println("orgstr: " + orgStr);
        System.out.println("substr: " + subStr);
    }
}
