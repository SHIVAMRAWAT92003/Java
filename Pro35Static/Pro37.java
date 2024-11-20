// Java supports a special block, called a static block (also called static clause) that can be used for static initialization of a class. This code inside the static block is executed only once: the first time the class is loaded into memory. 
// How to call static block without creating a object of a class.
//syntax:   class.forName("Class_Name");






class Emp {
   
   int emp_id;
   String emp_name;
   static String company_name;

   
    
    static{
    company_name="VNP"; 
     System.out.println("Static block is called");
    }

   public Emp(){
     emp_id=1;
     emp_name="xyz";
     System.out.println("Constructor block is called");
   }

   public void showEmp(){
        System.out.println("EMP ID : "+emp_id);
        System.out.println("EMP NAME : "+emp_name);
        System.out.println("COMPANY NAME : "+company_name);
   }


}

class Pro37{
    public static void main(String args[]){
        Emp e1 = new Emp();
        e1.showEmp();
        Emp e2 = new Emp();
        e2.showEmp();


    }
}