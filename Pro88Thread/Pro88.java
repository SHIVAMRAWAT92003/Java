// Java Threads
// Threads allows a program to operate more efficiently by doing multiple things at the same time.

// Threads can be used to perform complicated tasks in the background without interrupting the main program.

// Every thread you need to have a run () method and to invoke thread we use start().

// Runnable interface is parent of Thread class 



class A extends Thread {
    public void run(){ // run() present in Runnable interface
        for(int i=0;i<50;i++){
            System.out.println("Hello Shivam");
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("Hyy Shivam");
        }
    }
}

class Pro88 {
    public static void main(String arg[]){
        A obj1 = new A();
        B obj2 = new B();
 obj1.start(); //start() method present in thread class
 obj2.start();



    }
}