//Implementation of throws

class A{

public void show() throws ClassNotFoundException  {
    Class.forName("Demo");
}

}



class Pro71{

    public static void main(String args[]){

        A obj = new A();

      try{
        obj.show();
      }
      catch(ClassNotFoundException e){
        System.out.println("CLASS NOT FOUND ... "+e);
      }
      catch(Exception e){
        System.out.println("Something went wrong ... "+e);
      }


     
    }




}