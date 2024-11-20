class  A{

  public void fun1(){
  System.out.println("Inside fun1 ");
   }

}

class B extends A{

     public void fun2(){
     System.out.println("Inside fun2 ");
   }

}


class SingleInheritance{
  public static void main(String args[]){

     B b = new B();
     b.fun1();
     b.fun2();

  }
   
    
}