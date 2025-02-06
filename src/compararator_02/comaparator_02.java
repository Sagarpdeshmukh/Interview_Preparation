package compararator_02;

import java.util.Comparator;

public class comaparator_02 implements Comparator<Student_01> {
    @Override
    public int compare(Student_01 o1, Student_01 o2) {
       // for string use compareTo
        return o1.getAddress().compareTo(o2.getAddress());

        //for id use -
       // return  o1.getId() - o2.getId();
    }
}
