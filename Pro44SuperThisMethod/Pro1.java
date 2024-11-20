// Super Method => super method means call the constructor of super class(default one) but if we give parameter to super method then it call parameterized constructor of super class.


// calling default constructor of both parent and child class.
class A{
     
    public A(){
        super() ;
        System.out.println("This is Default Constructor of A");
    }
    public A(int n){
        super();
        System.out.println("This is Parameterized Constructor of A");
    }

}
class B extends A{

     public B(){
        super(); //if you will not mention it, by default it will be called first in every constructor.
        System.out.println("This is Default Constructor of B");
    }
    public B(int n){
        super();
        System.out.println("This is Parameterized Constructor of B");
    }

}
class Pro1{
    public static void main(String args[]){
    System.out.println("b1 is called ");
    B b1 = new B();



        
    }
}