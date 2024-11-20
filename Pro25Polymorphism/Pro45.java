// Method Overriding
// In Java, method overriding occurs when a subclass (child class) has the same method as the parent class.
// In Java, Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes. When a method in a subclass has the same name, the same parameters or signature, and the same return type(or sub-type) as a method in its super-class, then the method in the subclass(child) is said to override the method in the super-class(parent).

// Method overriding in Java is also known as dynamic method dispatch

class A{
    public int add(int a ,int b){
    System.out.println("In class A add function");
        return a+b;
    }
    public int sub(int a ,int b){
        System.out.println("In class B sub function");
        return a-b;
    }
 
}
class B extends A{
    public int add(int a ,int b){
        System.out.println("In class B add function");
        return a+b+1;
    }

}

class Pro45{
    public static void main(String args[]){
    B b = new B();
    System.out.println(b.add(6,2));
    System.out.println(b.sub(6,2));
    A a = new A();
    System.out.println(a.add(6,2));
    
    }


}