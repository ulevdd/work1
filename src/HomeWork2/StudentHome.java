package HomeWork2;


import HomeWork1.Student;

public class StudentHome {
    StudentHome(int id1, String name1, double eng1, double math1) {
        id = id1;
        name = name1;
        eng = eng1;
        math = math1;
    }

    StudentHome(String name2, double eng2, double math1) {
        this(0, name2, 0, 0);
    }

    StudentHome() {
    }
    int id;
    String name;
    double eng;
    double math;
}
    class StudentHomeTest {

        public static void main(String[] args) {

            StudentHome sTest = new StudentHome(1, "Dmitriy", 5.4, 6);
            StudentHome sTest1 = new StudentHome("Lexa", 3.4,2);
            sTest1.id =4;

            System.out.println(sTest.name);
            System.out.println(sTest1.id);


        }

    }
