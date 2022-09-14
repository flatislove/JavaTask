import java.util.Scanner;

//Напишите программу на Java, чтобы поменять местами значения, хранящиеся
// в двух переменных, без использования третьей переменной.
public class Main {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        System.out.println("a="+a+" b="+b);
        a+=b;
        b=a-b;
        a-=b;
        System.out.println("a="+a+" b="+b);
    }
}