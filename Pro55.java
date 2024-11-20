
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








