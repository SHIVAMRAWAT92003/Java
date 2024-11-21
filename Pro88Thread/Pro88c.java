// Implementing threads using Runnable interface 
// we use runnable because now if want to inherit some class in A we can do it 

class A implements Runnable{
  public void run(){
    for(int i=0;i<5;i++){
    System.out.println("Hyyy...");
               try{
               Thread.sleep(10);
               }catch(InterruptedException e)
               {
                  e.printStackTrace();
               }
    }
  }


}
class B implements Runnable{
  public void run(){
    for(int i=0;i<5;i++){
    System.out.println("Hello...");
               try{
               Thread.sleep(10);
               }catch(InterruptedException e)
               {
                  e.printStackTrace();
               }
    }
  }


}

class Pro88c{
   public static void main(String args[]){
    Runnable obj1 = new A();
    Runnable obj2 = new B();

    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);

    t1.start();
    t2.start();




   }




}


