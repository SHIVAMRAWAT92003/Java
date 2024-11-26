
// Objects and classes

class Employee{
private int salary;
private String name;
  void setName(String name){
    this.name=name;
  }
  String getName(){
    return name;
  }
  void setSalary(int salary){
    this.salary=salary;
  }
  int getSalary(){
    return salary;
  }


};

class Cellphone{
  void ring(){
    System.out.println("Ringing");
  }
  void vibrating(){
    System.out.println("Vibrating");
  }


}


class Square{

   int side;

   void setSide(int side){
    this.side=side;
   }

   int getArea(){
     return side*side;
   }
   int getPerimeter(){
     return 4*side;
   }


}


public class Pro22 {
    public static void main(String[] args) {


      // Employee
        // Employee e1= new Employee();
        // e1.setName("Shivam");
        // e1.setSalary(10000000);
        // System.out.println("Emp name is "+ e1.getName()+" and his current salary is "+e1.getSalary());
       
        
      // Cellphone
      // Cellphone c1 = new Cellphone();
      // c1.ring();
      // c1.vibrating();  


     // Square
     Square s = new Square();
     s.setSide(6);
     System.out.println("Perimeter and Area of square of side "+s.side+" is "+"Area :"+s.getArea()+",Perimeter :"+s.getPerimeter());  
















    }



}
