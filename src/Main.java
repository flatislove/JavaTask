import java.util.Scanner;

//Написать программу на Java для вычисления серии чисел Фибоначчи.
public class Main {
    public static void main(String[] args) {
        int number,x=0,y=0,z=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите количество значений");
        number=scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            x=y;
            y=z;
            z=x+y;
            System.out.println(x+" ");
        }
    }
}