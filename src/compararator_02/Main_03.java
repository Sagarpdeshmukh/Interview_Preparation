package compararator_02;

import java.util.ArrayList;
import java.util.Collections;

public class Main_03 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(new Student_01("dada",02,"aanagar"));
        al.add(new Student_01("aagar",9,"pune"));
        al.add(new Student_01("akshay",2,"snagar"));

        System.out.println("before sort "+ al);
        Collections.sort(al,new comaparator_02());
    }
}
