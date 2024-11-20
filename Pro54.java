// Anynomous Class
// It is an inner class without a name and for which only a single object is created. An anonymous inner class can be useful when making an instance of an object with certain “extras” such as overriding methods of a class or interface, without having to actually subclass a class.

class A{
    public void show(){
        System.out.println("In Show method of class A");
    }
}


class Pro54{
    public static void main(String args[]){
        A a = new A(){
           public void show(){
              System.out.println("In Show method of Anynomous class");
                             }
        };
            a.show();                 
    }
}








