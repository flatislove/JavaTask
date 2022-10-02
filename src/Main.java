import javax.sound.midi.Soundbank;
import java.util.*;

//1, 246, 2, 123, 3, 82, 6, 41 are the divisors of number 246. Squaring these divisors we get:
// 1, 60516, 4, 15129, 9, 6724, 36, 1681. The sum of these squares is 84100 which is 290 * 290.
//Task: Find all integers between m and n (m and n integers with 1 <= m <= n) such that the sum of their
// squared divisors is itself a square. We will return an array of subarrays or of tuples (in C an array
// of Pair) or a string. The subarrays (or tuples or Pairs) will have two elements: first the number the
// squared divisors of which is a square and then the sum of the squared divisors.
public class Main {
    public static void main(String[] args) {

        System.out.println(listSquared(1,250));

    }
    public static String listSquared(long m, long n) {
        TreeMap<Long,Long> mapNumbers = new TreeMap<>();
        Long multi;
        for (long i = m; i <=n ; i++) {
            multi=(long)0;
            for (long j = 1; j <=i ; j++) {
                if(i%j==0){
                    multi+=(long)(Math.pow(j,2));
                }
            }
            Long res=(long)Math.sqrt(multi);
            if(multi.equals(res*res)){
                mapNumbers.put(i,multi);
            }
        }
        String str ="";
        int counter=0;
            str+="[";
        for (Map.Entry<Long, Long> entry : mapNumbers.entrySet()) {
            str+=("["+entry.getKey()+", "+entry.getValue()+"]");
            counter++;
            if (counter<mapNumbers.size()){
                str+=", ";
            }
        }
            str+="]";
        return str;
    }
}