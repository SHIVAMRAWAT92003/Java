// Java inner class or nested class is a class that is declared inside the class or interface.

// We use inner classes to logically group classes and interfaces in one place to be more readable and maintainable.
// Types of Inner Classes
// There are basically four types of inner classes in java.

// Nested Inner Class
// Method Local Inner Classes
// Static Nested Classes
// Anonymous Inner Classes


import Pro53Package.*;

class Pro53{
    public static void main(String args[]){


        A obj1 = new A();
        obj1.show();
        //obj2.config() ; ==>error
    
    // Inner class object when inner class is not static.
    A.B obj2= obj1.new B();
    obj2.config();



// When inner class is static.
        C obj3 =new C();
        obj3.show();
        // obj3.config();==> error
        C.D obj4= new C.D(); // When we refer to static class we not need obj
         obj4.config();




     }
}