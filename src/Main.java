//Write a function that takes an integer as input, and returns the number of bits that are equal
// to one in the binary representation of that number. You can guarantee that input is non-negative.
public class Main {
    public static void main(String[] args) {
        System.out.println(countBitBinary(1234));
    }
    public static int countBitBinary(int number){
        String s= Integer.toBinaryString(number);
        int count=0;
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == '1') count++;
        }
        return count;
    }
}