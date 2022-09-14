import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Напишите Java-программу для итерации объекта типа HashMap
// с использованием цикла while и улучшенного цикла for.
public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        hashMap.put(1,"String1");
        hashMap.put(2,"String2");
        hashMap.put(3,"String3");
        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
        System.out.println("while");
        while (iterator.hasNext()){
            Map.Entry<Integer, String> current= iterator.next();
            System.out.println("key "+current.getKey()+"; value "+current.getValue());
        }
        System.out.println("for");
        for (Map.Entry current2: hashMap.entrySet()) {
            System.out.println("key "+current2.getKey()+"; value "+current2.getValue());
        }
    }
}