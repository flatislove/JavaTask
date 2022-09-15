import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

//Напишите Java-программу для обхода ArrayList с использованием цикла
// for, while и улучшенного цикла for.
public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("50");
        list.add("60");
        list.add("70");
        System.out.println(list.size());
        System.out.println("while");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("for+");
        for (Object o:list) {
            System.out.println(o);
        }
        System.out.println("for");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}