//Complete the method/function so that it converts dash/underscore delimited words into camel casing.
// The first word within the output should be capitalized only if the original word was capitalized
// (known as Upper Camel Case, also often referred to as Pascal case).
public class Main {
    public static void main(String[] args) {
        System.out.println(toCamelCaseString("Java-application"));
        System.out.println(toCamelCaseString("Java_application"));
        System.out.println(toCamelCaseString("java-application_task"));
    }

    public static String toCamelCaseString(String s){
        char[] chars = s.toCharArray();
        String result="";
        if (s.length()>0){
            result += chars[0];
            for (int i = 1; i < chars.length; i++) {
                if (chars[i-1]=='-'||chars[i-1]=='_'){
                    chars[i]=Character.toUpperCase(chars[i]);
                }
                result+=chars[i];
            }
        }
        result=result.replace("-","");
        result=result.replace("_","");
        return result;
    }
}
