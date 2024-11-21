// Exception ==> Exception is an unwanted or unexpected event, which occurs during the execution of a program, i.e. at run time, that disrupts the normal flow of the program’s instructions. 
//Errorn ==> 3 type 
// 1 Compile Time Error
// 2 Run Time Error ==>Exception
// 3 Logical Error

//Major reasons why an exception Occurs
// Invalid user input
// Device failure
// Loss of network connection
// Physical limitations (out-of-disk memory)
// Code errors
// Out of bound
// Null reference
// Type mismatch
// Opening an unavailable file
// Database errors
// Arithmetic errors


// Exception Handling in Java is one of the effective means to handle runtime errors so that the regular flow of the application can be preserved

import java.util.*;

public class Pro67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the numerator");
        int i = sc.nextInt();
        System.out.println("Enter the denominator");
        int j = sc.nextInt();
        int res=0;

        try{
            res = i/j;
            System.out.println("Ans of division is "+res );
        }
        catch(Exception e){
            System.out.println("Something went wrong..." +e);
            
        }
        System.out.println("Thankyou");


    }
    
}
