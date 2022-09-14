import java.util.Scanner;

//Напишите программу на Java для того, чтобы поменять местами значения,
// хранящиеся в двух переменных с помощью третьей переменной
public class Main {
    public static void main(String[] args) {
        int a,b,temp;
        System.out.println("Введите значения a и b");
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        System.out.println("a="+a+" b="+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("Result: a="+a+" b="+b);
    }
}