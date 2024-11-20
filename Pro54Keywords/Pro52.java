// Abstract keyword
// 1. we cant create object of Abstract clas but we can create reference of Abstract class .
// 2. If you want to make any methods as Abstract then you have to make the CLASS ASWELL ABSTRACT.
// 3. whatever class inherit the abstract class,the abstract method of abstract class will also be present in that class by sure.


abstract class Car{

  abstract void drive();
  abstract void fly();
  void music(){
    System.out.println("Playing Music");
  }
  void clean(){
    System.out.println("Cleaning");
  }

}
abstract class WagonR extends Car{ //concrete class
// i had make this class abstract because im not initalizing the abstract fly method of Car in this class.


    void drive(){
        System.out.println("WagonR is driving....");
    }
    

}
class UpdateWagonR extends WagonR{

    void drive(){
        System.out.println("Update WagonR is driving....");
    }
    void fly(){
        System.out.println("update WagnonR is flying....");
    }

}


class MgHector extends Car{

    void drive(){
        System.out.println("MgHector is driving....");
    }
    void fly(){
        System.out.println("MgHector is flying....");
    }


}

class Pro52{
    


    public static void main(String args[]){

 // Car c1 = new Car()  ===>give me error.
    // Car c2 = new WagonR();  ==>give error


    WagonR c2 = new UpdateWagonR();  
    c2.drive();
    c2.music();
    c2.clean();
    Car c3 = new MgHector();
    c3.drive();
    c3.music();
    c3.clean();

    }
   





}









