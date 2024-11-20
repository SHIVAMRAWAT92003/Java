// jagged ARRAY
import java.util.*;

class Pro30{
    public static void main(String args[]){
        // creating refernce for inputing 
    Scanner sc = new Scanner(System.in);
    // Creating 2D Array   
        int num[][] = new int[3][];

        num[0]= new int[3];
        num[1]= new int[4];
        num[2]= new int[2];

        // Input Array
        System.out.println("Inputing 2D array ");
        for(int i =0;i<num.length;i++){
            for(int j =0;j<num[i].length;j++){
                  num[i][j]=sc.nextInt(); 
            }
        } 
        
        // Print Array
         System.out.println("Printing 2D array ");
    //     for(int i =0;i<num.length;i++){
    //         for(int j =0;j<num[i].length;j++){
    //               System.out.print(num[i][j]+ " ");
    //         }
    //         System.out.println();
    //     } 


    for (int n[]:num){
        for(int j:n){
              System.out.print(j + " ");
        }
    System.out.println();
    }
    
    }
}