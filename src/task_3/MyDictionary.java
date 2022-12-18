package task_3;

import java.util.HashMap;
import java.util.Map;

public class MyDictionary <T, V>{
    Map<T, V> myDictionary = new HashMap<T, V>();

    public Map<T, V> getMyDictionary() {
        return myDictionary;
    }

    public void addKeyAndValue(T key, V value) {
        myDictionary.put(key, value);
    }

    public V getValueByKey(T key) {
        return myDictionary.get(key);
    }

    public int numberOfElements() {
        return myDictionary.size();
    }

    public static void main(String[] args) {
        MyDictionary<String, String> dictionary = new MyDictionary<>();
        dictionary.addKeyAndValue("first", "Sunday");
        dictionary.addKeyAndValue("second", "Monday");
        dictionary.addKeyAndValue("third", "Tuesday");

        System.out.println(dictionary.getMyDictionary());
        System.out.println("Number of elements: " + dictionary.numberOfElements());
        System.out.println("First element: " + dictionary.getValueByKey("first"));
        System.out.println("Second element: " + dictionary.getValueByKey("second"));
    }
}
