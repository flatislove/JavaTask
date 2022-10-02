import java.util.ArrayList;

//In this simple Kata your task is to create a function that turns a string into a Mexican Wave.
// You will be passed a string and you must return that string in an array where an uppercase
// letter is a person standing up.
public class Main {
    public static void main(String[] args) {

        String[] array = wave("two words");
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i].toString());
        }
    }

    public static String[] wave(String str) {
        char[] chars = str.toCharArray();
        ArrayList<String> resultList = new ArrayList<>();
        for (int i = 0; i <chars.length ; i++) {
            if(chars[i]!=' '){
                chars[i]=Character.toUpperCase(chars[i]);
                resultList.add(String.valueOf(chars));
                chars[i]=Character.toLowerCase(chars[i]);
            }
        }
        String[] result = new String[resultList.size()];
        result=resultList.toArray(result);
        return result;
    }
}