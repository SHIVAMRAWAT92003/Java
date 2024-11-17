// Method overloading
/* In Java, Method Overloading allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters, or a mixture of both.

Method overloading in Java is also known as Compile-time Polymorphism, Static Polymorphism, or Early binding. In Method overloading compared to the parent argument, the child argument will get the highest priority. */
// https://www.geeksforgeeks.org/method-overloading-in-java/

class overloading{
public int add(int n1,int n2){
    return n1+n2;
}
public double add(double n1,int n2){
    return n1+n2;
}
public double add(int n1,double n2){
    return n1+n2;
}
public double add(double n1,double n2){
    return n1+n2;
}
public int add(int n1,int n2,int n3){
    return n1+n2+n3;
}
public double add(double n1,int n2,int n3){
    return n1+n2+n3;
}
public double add(int n1,double n2,int n3){
    return n1+n2+n3;
}
public double add(int n1,int n2,double n3){
    return n1+n2+n3;
}
public double add(double n1,double n2,double n3){
    return n1+n2+n3;
}



}


class Pro25{

    public static void main(String args[]){
        overloading o1 = new overloading();
        double res = o1.add(2.7,3);
        System.out.println("Sum of numbers is "+ res);
        
    }

}


