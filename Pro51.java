// upcasting and downcasting
// A process of converting one data type to another is known as Typecasting and Upcasting and Downcasting is the type of object typecasting. In Java, the object can also be typecasted like the datatypes. Parent and Child objects are two types of objects. So, there are two types of typecasting possible for an object, i.e., Parent to Child and Child to Parent or can say Upcasting and Downcasting.


//  jiss class ka reference hoga usi class ke method acess hoge.


class A{


public void show1(){
    System.out.println("In A show");
}

}
class B extends A{

    public void show2(){
    System.out.println("In B show");
}

}

class Pro51{
    public static void main(String args[]){
         
         // Dynamic method dispatch  
         A a = new A();
         a.show1();
        //  a.show2(); ==>will give error b/c A class does'nt know the existance of B class method.



        // Upcasting => child /sub class to parent / super class.
        
        A a2 = (A)new B();   // B class object upcasting to A class object
        a2.show1();
        
        // Downcasting => parent / super class to child /sub class.
        
        B b = (B) a2;        // A (a2) class object downcasting to B class object 
        b.show2();






    }
}






