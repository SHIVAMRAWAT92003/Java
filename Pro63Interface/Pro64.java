//Lamda Expression in Java Function Interface.
// Lamda Expression only works with functionals interface. 
// Lambda Expressions were added in Java 8.
// A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
// Syntax
// The simplest lambda expression contains a single parameter and an expression:
// parameter -> expression

// To use more than one parameter, wrap them in parentheses:
// (parameter1, parameter2) -> expression


interface A{
    void show(int i);
}

public class Pro64 {

    public static void main(String arg []){
        A obj1 = new A(){
            public void show(int i ){
                 System.out.println("Show method in Anoynomous Class. "+ i);
            }
       };

//Lamda Expression
       A obj2 = (int i)->{
        System.out.println("This is called Lamda Expression ie shorten the code but behind the seen compiler will automatically do "+i+" .");
                
       };

       obj2.show(3);


    }
    
}
