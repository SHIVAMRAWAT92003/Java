// class - class     ====> extends
// class - interface ====> implements
// interface - interface ====> extends

interface A{
    void run();
}

interface B extends A{

}

class X implements B{
    public void run(){
        System.out.println("Runing..");
    }
    
}

class Pro60{
    public static void main(String args[]){
     A obj = new X();
     obj.run();

       
       
    }

}