//Your task is to sort a given string. Each word in the string will contain a single number.
// This number is the position the word should have in the result.
//Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
public class Main {
    public static void main(String[] args) {
        System.out.println(sortByNumber("is2 Thi1s T4est 3a"));
    }

    public static String sortByNumber(String s){
        if(s.length()!=0){
            String[] str = s.split(" ");
            String[] result = new String[str.length];
            for (String value : str) {
                char[] chars = value.toCharArray();
                for (char aChar : chars) {
                    if (Character.isDigit(aChar)) {
                        result[Character.getNumericValue(aChar) - 1] = value;
                    }
                }
            }
            return String.join(" ",result);
        }
        else return "";
    }
}