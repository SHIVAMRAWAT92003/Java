interface Computer{
    void Code();


}


class Laptop implements Computer{

    public void Code(){
        System.out.println("Code compile run.");
    }

}
class Desktop implements Computer{

    public void Code(){
        System.out.println("Code compile run execute.");
    }

}
class Devloper{

    public void devApp(Computer comp){
        comp.Code();
    }

}


class Pro58{
    public static void main(String args[]){

    Computer lap  = new Laptop();
    Computer desk = new Desktop();
    Devloper devNitin = new Devloper();
    
    devNitin.devApp(lap);
    devNitin.devApp(desk);





    }

}
