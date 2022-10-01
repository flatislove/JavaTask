//You will be given an array of numbers. You have to sort the odd numbers in ascending
// order while leaving the even numbers at their original positions.
public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{64, 6, 4, 3, 27, 2, 60, 45, 22, 70, 40, 71, 15, 97, 40, 29, 28, 32, 84, 20, 58, 83, 19, 5, 91, 58, 0, 81, 3, 77, 39, 82, 52, 34, 62, 34, 5, 72, 67};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int[] arrays = sortArray(array);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");
        }
    }
    public static int[] sortArray(int[] array) {
        int indicator=0;
        int prev=-1;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]%2!=0){
                if(prev>=0){
                    if(array[prev]>array[i]){
                        int temp=array[prev];
                        array[prev]=array[i];
                        array[i]=temp;
                        indicator++;
                        prev=i;

                    }
                    else prev=i;
                }
                else prev=i;
            }
        }
        if (indicator==0){
            return array;
        }
        return sortArray(array);
    }
}