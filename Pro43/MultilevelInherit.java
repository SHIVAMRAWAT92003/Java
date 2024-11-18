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
class C extends B{
     public void fun3(){
     System.out.println("Inside fun3 ");
   }

}

class MultilevelInherit{
     public static void main(String args[]){
     C b = new C();
     b.fun1();
     b.fun2();
     b.fun3();

  }
   
}