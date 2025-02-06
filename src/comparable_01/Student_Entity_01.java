package comparable_01;

public class Student_Entity_01 implements Comparable<Student_Entity_01> {


    private String name;
    private int id;
    private String address;

    public Student_Entity_01(String name, int id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    // Compare by ID in descending order
    //why to use comparable its not need to create diff class and at each time we are able to  Sort once
    @Override
    public int compareTo(Student_Entity_01 o) {
        return this.id  - o.id ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }



    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student_Entity_01{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                '}';
    }


}
