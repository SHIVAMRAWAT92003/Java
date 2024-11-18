// Anonymous Object in Java
// object which doeas not have any referernce is called Anonymous Object. 
// only problem with it is we can reuse it again

class Emp{

    private int id;
    private String str;
    
    Emp(){
System.out.println("Object is created");
    }
    public void method1(){
System.out.println("In method 1");
    } 


}

class Pro41{
    public static void main(String args[]){
        new Emp().method1();

    }
}