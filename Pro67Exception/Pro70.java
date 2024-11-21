
//Throws

class ShivamException extends Exception{
   
   public ShivamException(String str){
   super(str);
   }

}



class Pro70{
public static void main(String args[]){

try{
    Class.forName("Myclass");
}
catch( ClassNotFoundException e ){
    System.out.println("Class Not Found "+e);
}
catch(Exception e ){
    System.out.println(" Something went wrong... "+e);
}



}
}




