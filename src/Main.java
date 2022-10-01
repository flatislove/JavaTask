import java.util.Arrays;

//You are given an array (which will have a length of at least 3, but could be very large)
// containing integers. The array is either entirely comprised of odd integers or entirely
// comprised of even integers except for a single integer N. Write a method that takes the
// array as an argument and returns this "outlier" N.
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781};
        System.out.println(find(numbers));
    }

    static int find(int[] integers) {
        if(integers[0]%2==0){
            if (integers[1]%2==0||integers[2]%2==0){
                return Arrays.stream(integers).filter(i -> Math.abs(i) % 2 != 0).findFirst().getAsInt();
            }
            else return Arrays.stream(integers).filter(i -> Math.abs(i) % 2 == 0).findFirst().getAsInt();
        }
        else{
            if (integers[1]%2!=0||integers[2]%2!=0){
                return Arrays.stream(integers).filter(i -> Math.abs(i) % 2 == 0).findFirst().getAsInt();
            }
            else return Arrays.stream(integers).filter(i -> Math.abs(i) % 2 != 0).findFirst().getAsInt();
        }
    }
}