import java.util.Arrays;


class A{
    int[] num=new int[5];
   
    A(){
    num[0]=100;
    num[1]=120;
    num[2]=300;
    num[3]=240;
    num[4]=500;
   } 

   int[] num2={1,2,3,4,5};
    
}




public class Pro27 {

    public static void main(String[] args) {
        A a = new A();
        // System.out.println("First Element is : "+a.num[0]);
        // System.out.println("Array1  Elements:");
        // for(int i :a.num){
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        // System.out.println("Array2 Elements:");
        // for(int i :a.num2){
        //     System.out.print(i+" ");
        // }

        Arrays.sort(a.num);
        System.out.println(a.num); //This will ret
        System.out.println(Arrays.toString(a.num));
        




    }
}