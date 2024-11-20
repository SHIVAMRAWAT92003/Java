import java.util.*;

class Pro31{

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);


    int num1[] = new int[4];
    System.out.println("Inputing value for 1D Array ");
   for(int i =0;i<num1.length;i++){
    num1[i]=sc.nextInt();
   }
    System.out.println("Printing value for 1D Array ");
    for(int m:num1){
      System.out.print(m+" ");
    }



    int num2[][] = new int[4][3];
    System.out.println("Inputing value for 2D Array ");
   for(int i =0;i<num2.length;i++){
      for(int j =0;j<num2[i].length;j++){
    num2[i][j]=sc.nextInt();
   }}
    System.out.println("Printing value for 2D Array ");
    for(int ar1[]:num2){
       for(int m : ar1){
        System.out.print(m+ " ");
       }
       System.out.println();
    }







}}