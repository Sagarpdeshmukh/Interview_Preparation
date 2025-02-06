package equalsVsrefrence_03;

public class Main_02 {
    public static void main(String[] args) {
        Student_01 s1  = new Student_01();
        Student_01 s2  = new Student_01();
        System.out.println(s1 == s2);

        //if we dont override equals then it called parent equals and compare ref
        //if we want to compare content just overide in entity class its return true
        System.out.println(s1.equals(s2));
    }
}
