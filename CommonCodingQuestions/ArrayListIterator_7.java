package CommonCodingQuestions;

import java.util.ArrayList;
import java.util.Iterator;

//Q #8) Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.
public class ArrayListIterator_7 {

    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<>();
        ob.add(10);
        ob.add(20);
        ob.add(30);

        // for-loop
        System.out.println("*********** For-Loop**********");
        for (int i = 0; i < ob.size(); i++) {
            System.out.println(ob.get(i));
        }

        // while-loop-1
        System.out.println("*********** For-Loop-1**********");
        Iterator<Integer> data = ob.iterator();
        while (data.hasNext()) {
            System.out.println(data.next());
        }

        // while-loop-2
        System.out.println("***********For-Loop-2**********");
        int i = 0;
        while (i < ob.size()) {
            System.out.println(ob.get(i));
            i++;
        }

        // Enhanced For loop
        System.out.println("***********Enhanced For loop**********");
        for (Integer data1 : ob) {
            System.out.println(data1);
        }

    }

}
