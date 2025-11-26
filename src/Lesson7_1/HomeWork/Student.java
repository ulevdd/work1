package Lesson7_1.HomeWork;

public class Student {

    public int id;
    public String name;
    public double salary;
    public double salary2;

    public Student (int id1, String name1, double salary1, double salary3) {
        id = id1;
        name = name1;
        salary = salary1;
        salary2 = salary3;

        }

    public void srAr() {
        double summaSr = (salary+salary2) /3;
        System.out.println("Ср. зп за 2 месяца: "+ summaSr);

}

}

         class StudentTest {

            public static void main(String[] args) {

                Student st = new Student(1,"Dmitriy", 5.5,3.1);
                System.out.println(st.id + " " + st.name + " " + st.salary+ " "+  st.salary2);
                st.srAr();

            }

        }