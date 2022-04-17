package learn;

import java.util.HashMap;

public class MapEx {
    public static void main(String[] args) {
        HashMap<String,Integer> courses = new HashMap<>();
        courses.put("core java", 4004);
        courses.put("Python",4800);
        courses.put("spring", 6000);
        courses.put("android", 2000);
        System.out.println(courses);

        courses.forEach((e1,e2)-> System.out.println(e1+" => "+e2));


    }
}
