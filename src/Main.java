//Напишите программу на Java для переворачивания строки,
// изменив расположение символов в строке задом наперёд
// без использования встроенных в String функций.
public class Main {
    public static void main(String[] args) {
        String str="text string";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder=stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}