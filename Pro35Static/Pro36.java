// static Method
// 1. Static method can be call without creating object (ie we can call it using class)
// 2. In static method we can use Static Variable.
// 3. In Static method we can call non static variable if it has object reference.




import java.util.*;
class  Employees {
    int emp_id;
    String emp_name;
    int emp_age;
    String emp_number;
    static String company_name;


   public void show_details1(){
        System.out.println("EMP ID : "+emp_id);
        System.out.println("EMP NAME : "+emp_name);
        System.out.println("EMP AGE : "+emp_age);
        System.out.println("EMP NUMBER : "+emp_number);
        System.out.println("COMPANY NAME : "+company_name);
    }

   public static void show_details2(){

        System.out.println("STATIC METHODS 1 : 2. In static method we can only use Static Variable.");
        // System.out.println("EMP ID : "+emp_id);
        // System.out.println("EMP NAME : "+emp_name);
        // System.out.println("EMP AGE : "+emp_age);
        // System.out.println("EMP NUMBER : "+emp_number);
        System.out.println("COMPANY NAME : "+company_name);
    }

   public static void show_details3( Employees  emp){
        
        System.out.println("STATIC METHODS 2 :3. In Static method we can call non static variable if it has object reference.");
        System.out.println("EMP ID : "+ emp.emp_id);
        System.out.println("EMP NAME : "+emp.emp_name);
        System.out.println("EMP AGE : "+emp.emp_age);
        System.out.println("EMP NUMBER : "+emp.emp_number);
        System.out.println("COMPANY NAME : "+company_name);
    }


}

class Pro36{
    public static void main(String arg[]){


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

     
emp1.show_details1();
emp2.show_details1();
emp3.show_details1();
emp4.show_details1();



System.out.println("static method can be call without creating object (ie we can call it using class) ");
Employees.show_details2();
Employees.show_details3(emp1);



    }
}