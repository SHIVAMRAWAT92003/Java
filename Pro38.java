// Encapsulation 
// Encapsulation in Java is the process of bundling data and methods together in a single unit, and hiding the data from other classes. This helps to protect the data from accidental modification and improve the security, modularity, flexibility, and maintainability of a program. 

// To achieve encapsulation in Java, you can:
// Declare class variables and attributes as private
// Provide public get and set methods to access and update the value of a private variable .

// Here are some benefits of encapsulation:
// Security: Encapsulation is beneficial for security.
// Abstraction: Encapsulation helps to achieve abstraction.
// Log file maintenance: You can maintain a log file through a method when you bind your data with a method. 


import java.util.*;


class Emp{
    private int ID;
    private String NAME;



// getter
    public String getName(){
        return NAME;
    }

    public int getId(){
       return ID;
    }

// setter
    public void setName(String name){
         NAME=name;
    }

    public void setId(int id){
         ID=id;
    }



}

class Pro38{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Emp e1 = new Emp();
        Emp e2 = new Emp();
        
   
        e1.setName("Rakesh");
        e1.setId(1);
        System.out.println(e1.getId()+" : "+e1.getName());

        e2.setName("Mahesh");
        e2.setId(2);
        System.out.println(e2.getId()+" : "+e2.getName());


    }
}