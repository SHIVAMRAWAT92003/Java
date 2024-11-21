// USER DEFINED EXCEPTION ;

import java.util.Scanner;

class ShivamException extends Exception{
    public ShivamException(String str){
        super(str);
    }
}


public class Pro69 {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();


        try{
            if(str.equals("shivam")){
                throw new ShivamException("Im shivam exception");
            }
        }
        catch(ShivamException e){
              System.out.println("Something went wrong "+e);
        }
        catch(Exception e){
            System.out.println(e);

        }

    }





}
