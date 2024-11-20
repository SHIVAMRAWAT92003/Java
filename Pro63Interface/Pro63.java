//Functional interface -- the interface which have only 1 method;

@FunctionalInterface
interface A {

     void show();
     
}

class B implements A   {

     public void show(){
          System.out.println("Show method in class B.");
     }
     

     
}



public class Pro63 {

     public static void main(String arg[]){

          A obj = new B();
          obj.show();


// Interface cant used to create object but we can d this in functional Interface only for anonymous class.
         
//instantiate A by definig its own implementation.
        A obj2 = new A(){

               public void show(){
                    System.out.println("Show method in Anoynomous Class.");
               }
          };
          obj2.show();




     }
}
