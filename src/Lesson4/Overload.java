package Lesson4;

public class Overload {

    void show (int i1) {
        System.out.println(i1);
        System.out.println("DaraType is int");
    }
    void show (boolean b1){
        System.out.println(b1);
        System.out.println("DataType  is bool");
    }
    void show (String s1) {
        System.out.println(s1);

    }

    void show (String s, int a){

        System.out.println("String " + s + " Int "+ a );

    }

}
class OverloadTest1{

    public static void main(String[] args) {
        Overload mO = new Overload();
        int a= 500;
        mO.show(a);
        boolean b = true;
        mO.show(b);
        mO.show("Hello");
        mO.show("EBANIY POT", 55);
    }
}




