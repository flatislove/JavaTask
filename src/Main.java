import java.util.Scanner;

//Напишите Java-программу, чтобы определить, является ли строка
// или число палиндромом, или нет.
public class Main {
    public static void main(String[] args) {
        String input,reverse="";
        Scanner scanner = new Scanner(System.in);
        int stringLengt;
        System.out.println("Введите число или строку");
        input = scanner.nextLine();
        stringLengt=input.length();
        for (int i = stringLengt-1; i >=0 ; i--) {
            reverse += input.charAt(i);
        }
        if (input.equals(reverse)){
            System.out.println("палиндром");
        }
        else System.out.println("не палиндром");
    }
}