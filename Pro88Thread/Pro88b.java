// thread priority  == range goes from 1(lowest priority) to 10(hihest priority),we suggest to scheduler only.

class A extends Thread{
    public void run(){
        for(int i =0;i<20;i++){
            System.out.println("Hyyy");
               try{
               Thread.sleep(10);
               }catch(InterruptedException e)
               {
                  e.printStackTrace();
               }

        }
    }
}
class B extends Thread{
    public void run(){
        for(int i =0;i<20;i++){
            System.out.println("Hello");
            try{
               Thread.sleep(10);
               }catch(InterruptedException e)
               {
                  e.printStackTrace();
               }

        }
    }
}

class Pro88b{
public static void main(String args[]){

A obj1 = new A();
B obj2 = new B();


// Obj1.getPriority();
// obj2.setPriority(Thread.MAX_PRIORITY);
// obj2.setPriority(Thread.MIN_PRIORITY);
// obj2.setPriority(Thread.NORM_PRIORITY);
// obj2.setPriority(7);

obj1.start();
obj2.start();

}

}