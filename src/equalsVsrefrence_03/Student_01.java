package equalsVsrefrence_03;

import java.util.Objects;

public class Student_01 {

    private  int id;

    @Override
    public boolean equals(Object o) {
    //ust cast obje to entity and  use == id with cast ie converted obj into student
        Student_01 o1 = (Student_01) o;
        System.out.println("in equals override method ");
        return  o1.id == this.id;
    }


}
