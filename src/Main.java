import java.util.HashMap;

//Напишите программу на Java для подсчета количества
// конкретных слов в строке, используя HashMap.
public class Main {
    public static void main(String[] args) {
        String str="word1 word2 word2 word3 word5 word2";
        String[] words = str.split(" ");
        HashMap<String,Integer> wordsMap = new HashMap<String,Integer>();
        for (int i = 0; i <=words.length-1 ; i++) {
            if(wordsMap.containsKey(words[i])){
                int counter = wordsMap.get(words[i]);
                wordsMap.put(words[i],counter+1);
            }
            else {
                wordsMap.put(words[i],1);
            }
        }
        System.out.println(wordsMap);
    }
}