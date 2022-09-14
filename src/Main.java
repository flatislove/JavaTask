//Напишите программу на Java для переворота последовательности символов
// в строке без использования встроенной в String функции reverse().
public class Main {
    public static void main(String[] args) {
        String str = "reverse string";
        char[] symbols = str.toCharArray();
        for (int i = symbols.length-1; i >=0 ; i--) {
            System.out.print(symbols[i]);
        }
    }
}