import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;

public class Collection {
    public static void main(String[] args) {
        // ArrayList example
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");

        System.out.println("ArrayList Elements:");
        for (String language : arrayList) {
            System.out.println(language);
        }
        System.out.println();

        // LinkedList example
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        System.out.println("LinkedList Elements:");
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        // HashSet example
        HashSet<Double> hashSet = new HashSet<>();
        hashSet.add(3.14);
        hashSet.add(2.71);
        hashSet.add(1.618);

        System.out.println("HashSet Elements:");
        for (Double number : hashSet) {
            System.out.println(number);
        }
        System.out.println();

        // HashMap example
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        System.out.println("HashMap Elements:");
        for (String key : hashMap.keySet()) {
            System.out.println(key + ": " + hashMap.get(key));
        }
    }
}