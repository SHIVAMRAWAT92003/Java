// super method

// calling parameterized constructor of parent class and default construtor of child class.
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
        super(0); //if you will not mention it, by default it will be called first in every constructor.
        System.out.println("This is Default Constructor of B");
    }
    public B(int n){
        super();
        System.out.println("This is Parameterized Constructor of B");
    }

}
class Pro4{
    public static void main(String args[]){
   

     System.out.println("b4 is called ");
     B b4 = new B();


        
    }
}  