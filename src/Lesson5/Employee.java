package Lesson5;

 class Employee {
     double salary;

     void dvoyZp () {
            double dvoyZ= salary*2;
        System.out.println("New zp: ");
    }
     Employee (double salary2){
        salary=salary2;
    }
    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoyZp();
    }

}
 class EmployeeTest {

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoyZp();
    }
}

