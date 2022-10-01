import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//Given a list and a number, create a new list that contains each number of list at most N times,
//without reordering.For example if the input number is 2, and the input list is [1,2,3,1,2,1,2,3],
//you take [1,2,3,1,2], drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times,
// and then take 3, which leads to [1,2,3,1,2,3]. With list [20,37,20,21] and number 1, the result would be [20,37,21].
public class Main {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 };
        System.out.println(Arrays.toString(deleteNth(array,3)));
    }
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        ArrayList<Integer> resultList = new ArrayList<>();
        HashMap<Integer,Integer> mapCount= new HashMap<>();
        for (int i = 0; i <elements.length ; i++) {
            if (!mapCount.containsKey(elements[i])){
                mapCount.put(elements[i],maxOccurrences);
            }
        }
        for (int i = 0; i <elements.length ; i++) {
            if (mapCount.containsKey(elements[i])&&mapCount.get(elements[i])>0){
                resultList.add(elements[i]);
                int temp=mapCount.get(elements[i]);
                mapCount.put(elements[i],temp-1);
            }
        }
        int[] resultArray=new int[resultList.size()];
        for (int i = 0; i <resultArray.length ; i++) {
            resultArray[i]=resultList.get(i);
        }
        return resultArray;
    }
}