
// In Java, an interface specifies the behavior of a class by providing an abstract type. Interfaces are used in Java to achieve abstraction
// Java interfaces define method signatures without implementations, giving classes a template to follow. 
// variables interface is by default final and static.
// Methods interface is by default public and abstract.



interface A{
    int age =1;  // variables in by default final and static.
    void show(); // Methods in by default public and abstract.
    void config();
}


class B implements A{
    public  void show(){
        System.out.println("In show methods");
    }
    public void config(){
        System.out.println("In config methods");
    }
}


class Pro56{
    public static void main(String args[]){
  
   A a  = new B();
   a.show();
   a.config();

   System.out.println(A.age);  //static variable can call without objects.
    //  A.age =21;  ==>give error because final variable cant be modified.  


 }
}