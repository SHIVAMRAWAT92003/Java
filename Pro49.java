// Refernce of super class and object of sub class.

class A{
    public void show(){
        System.out.println("In A show");
        
    }
    public void methodA(){
        System.out.println("In A Method only");
        
    }

}

class B extends A{
    public void show(){
        System.out.println("In B show");   
    }
    public void methodB(){
        System.out.println("In B Method only");
        
    }
}
class C extends A{
public void show(){
        System.out.println("In C show");
       
    }
    public void methodC(){
        System.out.println("In C Method only");
        
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
        obj1.methodA();
        // obj1.methodB(); ==>error
         obj1 = new C();
        obj1.show();

        // This will give error because class D does not inherit class A 
        //  obj1 = new D();
        // obj1.show();



    }
}