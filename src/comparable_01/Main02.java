package comparable_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main02 {

    //comparable for this we dont need to create seprate class just implements in ENtity
    //class with comparable interface
    public static void main(String[] args) {
        List<Student_Entity_01> s1= new ArrayList<>();

        s1.add(new Student_Entity_01("Sagar",9,"nagar"));
        s1.add(new Student_Entity_01("Akshay",11,"au"));
        s1.add(new Student_Entity_01("Deshmukh",1,"sa"));

        Collections.sort(s1);
        System.out.println(s1);
    }



}
