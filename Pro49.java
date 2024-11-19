// Refernce of super class and object of sub class.

class A{
    public void show(){
        System.out.println("In A show");
        
    }

}

class B extends A{
    public void show(){
        System.out.println("In B show");   
    }
}
class C extends A{
public void show(){
        System.out.println("In C show");
       
    }
}
class D{
    public void show(){
        System.out.println("In D show");
        
    }
}


class Pro49{
    public static void main(String arg[]){
        A obj1 = new A();
        obj1.show();

        // Dynamic Method Dispatch
         obj1 = new B();
        obj1.show();
         obj1 = new C();
        obj1.show();

        // This will give error because class D does not inherit class A 
        //  obj1 = new D();
        // obj1.show();



    }
}