//Abstract keyword=  we cant create obj of abstract class but we can create reference of abstract class
// Abstract method can only present in abstract class
// whatever class extends the abstract class ,the abstract method will also must be present in that class with initization.
// if we use abstract with method in some class then in that class only that method declration will be there and defination ie explation will be in abstract class.


abstract class A{
    public abstract void show();
}



class Pro55{
    public static void main(String args[]){
        A a = new A(){
           public void show(){
              System.out.println("In Show method of Anynomous class");
                             }
        };
            a.show();                 
    }
}








