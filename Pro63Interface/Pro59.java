// multiple inheritance in class is not applicable but applicable in interface.

interface A{

    int age =12;
    void Ashow();
    void Aconfig();

}
interface Z{

   
    void Zshow();
    void Zconfig();

}



class B implements A, Z{
    public void Ashow(){
        System.out.println("In A show methods");
    }
     public void Aconfig(){
        System.out.println("In A config methods");
    }
    public void Zshow(){
        System.out.println("In Z show methods");
    }
     public void Zconfig(){
        System.out.println("In Z config methods");
    }
}


class Pro59{
    public static void main(String args[]){
        
        A obj = new B();
        obj.Ashow();
        obj.Aconfig();


        Z obj2 = new B();
        obj2.Zshow();
        obj2.Zconfig();








    }

}