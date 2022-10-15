public class Main {
    public static void main(String[] args) {
        System.out.println(rgb(0,34,21));
    }
    public static String rgb(int r, int g, int b) {
        return toTwoSymbols(r)+toTwoSymbols(g)+toTwoSymbols(b);
    }
    public static String toTwoSymbols(int number){
        if (number>255) number=255;
        else if (number<0) number=0;
        if (Integer.toHexString(Math.abs(number)).length()<2) return ("0"+Integer.toHexString(number)).toUpperCase();
        else return Integer.toHexString(number).toUpperCase();
    }

}