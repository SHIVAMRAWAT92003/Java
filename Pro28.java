// 1D ARRAY AND INPUT IN ARRAY

import java.util.*;

class Pro28{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
int num[]= new int[6];
System.out.println("Input Values ");
for(int i =0;i<num.length;i++){
    num[i]=sc.nextInt();
}

System.out.println("Printing Values ");
for(int i =0;i<num.length;i++){
   System.out.print(num[i]+" "); 
}
System.out.println();
    }
}

