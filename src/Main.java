import java.util.Scanner;

//Напишите программу на Java, чтобы узнать, является ли число простым или нет.
public class Main {
    public static void main(String[] args) {
        int temp,number;
        boolean numberPrime=true;
        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();
        scanner.close();
        for (int i = 2; i <=number/2 ; i++) {
            if(number%i==0){
                numberPrime=false;
                break;
            }
        }
        if (numberPrime){
            System.out.println(number+" простое");
        }
        else System.out.println(number+" не простое");
    }
}