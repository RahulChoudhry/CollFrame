package learn;

import java.util.*;
public class StartCode {
    public static void main(String[] args) {
        System.out.println("Welcome to java collection framework");
        /*
          creating collection
          1). Type Safe - same type of elements(objects) are added to collection.
          2). Un Type Safe - different type of element are added to collection.
         */
        //Type safe collection.
        ArrayList<String> names = new ArrayList<>();
        names.add("Rahul");
        names.add("Amit");
        names.add("Ravi");
        names.add("Teenu");
        System.out.println(names);
        System.out.println(names.get(0));
        //System.out.println(names.get(1));
        //System.out.println(names.get(2));
        System.out.println(names.get(3));

        //Un Type Safe collection
        //LinkedList list = new LinkedList();
        //list.add("Sachin");
        //list.add(101);
        //list.add(435.787);
        //list.add(true);
        //System.out.println(list);

        names.remove("Amit");
        System.out.println(names);

        //Size
        System.out.println("Size " + names.size());

        //check item is there or not
        System.out.println(names.contains("Ram"));

        //check for empty
        System.out.println(names.isEmpty());

        //setting value
        //name.set(1,"Sunder")
        names.add(1,"Sunder");
        names.add(3,"Manish");
        System.out.println(names);

        // remove all element
        names.clear();
        System.out.println(names);

        Vector<String> vector = new Vector<>(names);
        System.out.println("Vector " + vector);

        System.out.println("-------------------------------------------------------");

        HashSet<Double> hashSet = new HashSet<>();
        hashSet.add(23.43);
        hashSet.add(434.345);
        hashSet.add(234.333);
        hashSet.add(77.4);
        hashSet.add(77.4);
        hashSet.add(5.3);
        System.out.println(hashSet);

        TreeSet<Double> treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet);



    }


}
