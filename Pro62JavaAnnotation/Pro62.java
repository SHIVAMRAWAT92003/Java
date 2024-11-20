// Java Annotations
// Java Annotation is a tag that represents the metadata i.e. attached with class, interface, methods or fields to indicate some additional information which can be used by java compiler and JVM.
// Annotations in Java are used to provide additional information, so it is an alternative option for XML and Java marker interfaces.
// Built-In Java Annotations used in Java code
// @Override
// @SuppressWarnings
// @Deprecated

class A{

    public void show(){
        System.out.println("In class A ");
    }
}
class B extends A{

    @Override
    public void show(){
        System.out.println("In class B");
    }

}



public class Pro62 {
    public static void main(String args[]){
        B obj = new B();
        obj.show();

    }
}
