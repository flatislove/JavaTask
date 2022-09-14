import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        str = scanner.nextLine();
        String[] temp = str.split("");
        for (int i = temp.length-1; i >=0 ; i--) {
            System.out.print(temp[i]+"");
        }
    }
}