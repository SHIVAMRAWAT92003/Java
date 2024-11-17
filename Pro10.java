// Relationals and Logical

class Pro10{

public static void main(String args[]){
    //  Relationals
   int num1=2;
   int num2=4;
   int num3=-1;
   System.out.println(num2==num1);
   System.out.println(num2>num1);
   System.out.println(num2>=num1);
   System.out.println(num2<num1);
   System.out.println(num2<=num1);


    //Logicals
    boolean res1 = num1>num2 && num2>num3;
    System.out.println(res1);
    boolean res1 = num2>num3 || num1>num2;
    System.out.println(res1);




}

}