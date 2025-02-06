package compararator_02;

import comparable_01.Student_Entity_01;

public class Student_01 {

    public Student_01(String name, int id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    private String name;
        private int id;
        private String address;



        // in comaprator use diff class ands its useful to comapare diff thing by using each time diff class dont need to changer code
    //as comaparable


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
            return "Student_01{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    ", address='" + address + '\'' +
                    '}';
        }


    }


