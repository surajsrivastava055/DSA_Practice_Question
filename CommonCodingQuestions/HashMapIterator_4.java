package CommonCodingQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Q #4) Write a Java Program to iterate HashMap using While and advance for loop.
public class HashMapIterator_4 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Gyan", 29);
        map.put("Anuj", 20);
        map.put("Shubham", 23);
        map.put("Jay", 32);

        System.out.println("***********With the help of For loop**************");

        // with the help of for
        for (Map.Entry<String, Integer> ob : map.entrySet()) {
            System.out.println(ob.getKey() + ": " + ob.getValue());
        }

        System.out.println("***********With the help of While loop**************");
        // with while loop
        Iterator<Map.Entry<String, Integer>> ob = map.entrySet().iterator();
        while (ob.hasNext()) {
            Map.Entry<String, Integer> data = ob.next();
            System.out.println(data.getKey() + ": " + data.getValue());
        }
    }

}
