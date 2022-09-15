//Напишите программу на Java, чтобы найти повторяющиеся символы в строке.
public class Main {
    public static void main(String[] args) {
       String str = new String("textstring");
       int counter = 0;
       char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <str.length() ; j++) {
                if (chars[i]==chars[j]){
                    System.out.println(chars[i]);
                    counter++;
                    break;
                }
            }
        }
    }
}