//Lamda Expression with return value.


interface A{
    int add(int a,int b );
}



public class Pro65 {

 public static void main(String args[]){

    //Lamda Expression
    A obj2 = (int a,int b)->{
        return a+b;    

};

System.out.println(obj2.add(2,3));

 }

    }
    

