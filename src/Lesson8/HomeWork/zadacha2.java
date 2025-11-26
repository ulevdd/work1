package Lesson8.HomeWork;

public class zadacha2 {


    static final double p=3.14;


    double ploshad (double pl){

        double pll=p*pl*pl;

        System.out.println("Площадь: " + pll);
        return  pll;
         }

}
class ZadachaTest {

    public static void main(String[] args) {

        zadacha2 pl1 = new zadacha2();
        pl1.ploshad(5);

    }


}