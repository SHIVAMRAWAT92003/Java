// this method = will evokes the constructor of same class .Initalized inside constructor.


// b4 is called 
// This is Default Constructor of A
// This is Default Constructor of B
// This is Parameterized Constructor of B

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
        super(); 
        System.out.println("This is Default Constructor of B");
    }
    public B(int n){
        this();
        System.out.println("This is Parameterized Constructor of B");
    }

}
class Pro5{
    public static void main(String args[]){
   

     System.out.println("b4 is called ");
     B b5 = new B(4);


        
    }
}  