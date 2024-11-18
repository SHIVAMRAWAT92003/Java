// Multiple inhertiance is not possible in java because it create ambiguity in case of same name function or variable in all classes. 

class  A{

  public void fun1(){
  System.out.println("Inside fun1 ");
   }

}

class B {

     public void fun2(){
     System.out.println("Inside fun2 ");
   }

}
// we cant do multiple inheritance.
class C extends B, A {

     public void fun3(){
     System.out.println("Inside fun3 ");
   }

}



class MultipleInherit{
    public static void main(String args[]){

    }
}