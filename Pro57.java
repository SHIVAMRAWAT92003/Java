abstract class Computer{
    public abstract void Code();


}


class Laptop extends Computer{

    public void Code(){
        System.out.println("Code compile run.");
    }

}
class   Desktop extends Computer{

    public void Code(){
        System.out.println("Code compile run execute.");
    }

}
class Devloper{

    public void devApp(Computer comp){
        comp.Code();
    }

}


class Pro57{
    public static void main(String args[]){

    Computer lap  = new Laptop();
    Computer desk = new Desktop();
    Devloper devNitin = new Devloper();
    
    devNitin.devApp(lap);
    devNitin.devApp(desk);





    }

}
