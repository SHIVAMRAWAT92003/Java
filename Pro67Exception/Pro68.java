// The throw keyword in Java is used to explicitly throw an exception from a method or any block of code. We can throw either checked or unchecked exception. The throw keyword is mainly used to throw custom exceptions. 




import java.beans.Expression;
import java.util.*;
public class Pro68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] myNum = {10, 20, 30, 40};

        System.out.println("Enter the index");
        int index = sc.nextInt();


        try{
            if(index>=4){
                throw new ArrayIndexOutOfBoundsException("Array out of bond");
            }
            System.out.println("Value at given index is "+myNum[index]);
            }
            catch(ArithmeticException e){
                System.out.println("Something went wrong "+e);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index. " + e);
            } 
            catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e);
    }

    
    

        
}
}
