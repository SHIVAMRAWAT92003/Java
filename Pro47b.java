
import Pro47Package.*;

class Pro47b extends D{
    public static void main(String args[]) {
   
// this will give error .
    // D d = new D();
    // d.methodD();


//  because methodD is protected so to call methodD we have to inherit it and call using object or parent class.  .
 Pro47b p = new Pro47b();

 System.out.println("MethodD is calling from differnt package sub class ");
 p.methodD();




    }
}