package Lesson4;

public class Overload2 {

    int sum(int i1, int i2) {
        return i1 + i2;

    }

    String sum(String s1, String s2) {
        return s1 + s2;
    }

}
    class OverloadTest {

        public static void main(String[] args) {

            Overload2 mO2 = new Overload2();
            int a = mO2.sum(5, 3);
            System.out.println(a);
        }




    }
