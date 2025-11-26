package Lesson7_1;


import Lesson7_1.HomeWork.Student;

public class FreeClass {

    public static void main(String[] args) {
        Student st = new Student(1,"Dmitriy", 5.5,3.1);
        System.out.println(st.id + " " + st.name + " " + st.salary+ " "+  st.salary2);
        st.srAr();
    }



}
