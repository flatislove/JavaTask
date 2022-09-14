import java.util.Scanner;
//Напишите программу на Java для переворота последовательности символов
// в строке без использования встроенной в String функции reverse().
public class Main {
    public static void main(String[] args) {
        String inputString, reverseString = "";
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        inputString=scanner.nextLine();
        for (int i = inputString.length()-1; i>=0 ; i--) {
            reverseString+=inputString.charAt(i);
        }
        System.out.println(reverseString);
    }
}