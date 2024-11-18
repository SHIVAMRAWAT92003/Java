// this keyword in Java
// There can be a lot of usage of Java this keyword. In Java, this is a reference variable that refers to the current object.

// java this keyword
// Usage of Java this keyword
// Here is given the 6 usage of java this keyword.

// this can be used to refer current class instance variable.
// this can be used to invoke current class method (implicitly)
// this() can be used to invoke current class constructor.
// this can be passed as an argument in the method call.
// this can be passed as argument in the constructor call.
// this can be used to return the current class instance from the method.



import java.util.*;

class Emp{

   int id;
   int age;

   public void setter(int id,int age){
    this.id=id;
    this.age=age;
   }
  
   public int getAge(){
   return age;
   }
  
   public int getId(){
   return id;
   }
  
  
}


class Pro39{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Emp e1 = new Emp();
        Emp e2 = new Emp();
        
   
  
        e1.setter(1,11);
        System.out.println(e1.getId()+" : "+e1.getAge());

     
        e2.setter(2,22);
        System.out.println(e2.getId()+" : "+e2.getAge());


    }
}