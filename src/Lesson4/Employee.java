package Lesson4;

import Lesson3.Employe;

public class Employee {
    public Employee(int id1, String name1, int age1){
        this (id1,name1,age1,0.0, null);


        }


    Employee (String name2, int age2){
    }

    Employee (int id3, String name3, int age3,double salary3, String department3) {
        id=id3;
        name3=name3;
        age=age3;
        salary=salary3;
        department=department3;
    }


    int id;
    String name;
    int age;
    double salary;
    String department;

}
 class EmplyeeTest {

     public static void main(String[] args) {
         Employee em1 = new Employee(1, "Ivanov", 44);


         System.out.println(em1.name);

     }
 }