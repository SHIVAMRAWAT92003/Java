// Final keyword make variable constant ,final keyword make method to do method overriding ,final keywords make class not able to inherirtable


final class A{

final public void show(){
    System.out.println("Shivam");
}

}


// class B extends A{     //===>give error because "A Class" is delecared as final so we cant INHERIT it.
// public void show(){  //===>give error  because "show()" is delecared as final in "class A" so we cant OVERDIDE it.
//     System.out.println("Shivam Rawat");
// }
// }


class Pro50{
    public static void main(String args[]){
       A a = new A();
       a.show();
      
        final int num =9;
        // num =10; ==>give error because final varaible value cant update.
      

    }
}