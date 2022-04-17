package learn;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseEx {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Rahul");
        names.add("Amit");
        names.add("Ravi");
        names.add("Teenu");
        names.add("ABC");
        //System.out.println(names);

        //for-each loop
        for (String str : names) {
            System.out.println(str + "\t" + str.length() + "\t");
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
        }
        System.out.println("----------------------------------------");
        //travering using Iterator
        for (String next : names) {
            System.out.println(next);
        }
        //backword traversal of collection LISTITERATOR
        ListIterator<String> li = names.listIterator(names.size());
        while (li.hasPrevious())
        {
            String previous = li.previous();
            System.out.println(previous);
        }
        //Enumeration
        System.out.println("+++++++++++++++++For Each Method+++++++++++++++++++++++");
        names.forEach(System.out::println);

        TreeSet<String> set = new TreeSet<>(names);
        for (String s : set) {
            System.out.println(s);
        }

        // Comparable // Compaarator


    }
}
