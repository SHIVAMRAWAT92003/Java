// 2D ARRAY
import java.util.*;

class Pro29{
    public static void main(String args[]){
        // creating refernce for inputing 
    Scanner sc = new Scanner(System.in);
    // Creating 2D Array   
        int num[][] = new int[3][4];

        // Input Array
        System.out.println("Inputing 2D array ");
        for(int i =0;i<num.length;i++){
            for(int j =0;j<num[i].length;j++){
                  num[i][j]=sc.nextInt(); 
            }
        } 
        
        // Print Array
         System.out.println("Printing 2D array ");
        for(int i =0;i<num.length;i++){
            for(int j =0;j<num[i].length;j++){
                  System.out.print(num[i][j]+ " ");
            }
            System.out.println();
        } 
    }
}