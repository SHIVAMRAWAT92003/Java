// In Java, a static variable is a variable that is shared among all instances of a class. It is also known as a class variable. 
// Here are some characteristics of static variables:
// Memory allocation
// Static variables are only allocated memory once, when the class is loaded into memory. 
// Common properties
// Static variables can be used to represent common properties of all objects, such as the company name of employees or the college name of students. 
// Changes reflected across all instances
// Any changes made to a static variable will be reflected across all instances of the class. 
// Global variable
// Static variables are like global variables and are available to all methods. 
// To declare a variable as static in Java, you can place the static keyword before initializing the variable. 


import java.util.*;
class Employees{
    int emp_id;
    String emp_name;
    int emp_age;
    String emp_number;
    static String company_name;


   public void show_details(){
        System.out.println("EMP ID : "+emp_id);
        System.out.println("EMP NAME : "+emp_name);
        System.out.println("EMP AGE : "+emp_age);
        System.out.println("EMP NUMBER : "+emp_number);
        System.out.println("COMPANY NAME : "+company_name);
    }


}
class Pro35{
    public static void main(String args []){
        Employees emp1 = new Employees();
        emp1.emp_id=1;
        emp1.emp_name="Shivam Rawat";
        emp1.emp_age=22;
        emp1.emp_number="8287039XXX";
        // static method is called using class name
        Employees.company_name="Amazon";

        Employees emp2 = new Employees();
        emp2.emp_id=2;
        emp2.emp_name="Shiv Rawat";
        emp2.emp_age=21;
        emp2.emp_number="9987039XXX";

        Employees emp3 = new Employees();
        emp3.emp_id=3;
        emp3.emp_name="Nikita Rawat";
        emp3.emp_age=22;
        emp3.emp_number="6387039XXX";

        Employees emp4 = new Employees();
        emp4.emp_id=4;
        emp4.emp_name="Niki Rawat";
        emp4.emp_age=23;
        emp4.emp_number="6007039XXX";

     
emp1.show_details();
emp2.show_details();
emp3.show_details();
emp4.show_details();

    }

}
























